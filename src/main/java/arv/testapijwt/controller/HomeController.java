package arv.testapijwt.controller;

import arv.testapijwt.config.JwtUtility;
import arv.testapijwt.model.Clients;
import arv.testapijwt.model.JwtRequest;
import arv.testapijwt.model.JwtResponse;
import arv.testapijwt.service.ClientServiceImpl;
import arv.testapijwt.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ArvikV
 * @version 1.0
 * @since 01.05.2022
 */
@RestController
public class HomeController {
    @Autowired
    private MyUserDetailsService userDetailsService;
    @Autowired
    private JwtUtility jwtUtility;
    @Autowired
    private AuthenticationManager  authenticationManager;

    @GetMapping("/")
    public String home() {
        return "JWT THROW SECURITY";
    }

    /**
     * этот ендпойт берет запрос, из него берет логин пароль, создает юзердетайл и генерирует токен
     * @param jwtRequest запрос
     * @return на выходе токен
     */
    @PostMapping("/authenticate")
    public JwtResponse athrnticate(@RequestBody JwtRequest jwtRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            jwtRequest.getUsername(),
                            jwtRequest.getPassword()
                    )
            );
        } catch (BadCredentialsException e) {
            throw new Exception("invalid credential", e);
        }

        final UserDetails userDetails = userDetailsService.loadUserByUsername(jwtRequest.getUsername());
        final String token = jwtUtility.generateToken(userDetails);
        return new JwtResponse(token);
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout=true";
    }
}
