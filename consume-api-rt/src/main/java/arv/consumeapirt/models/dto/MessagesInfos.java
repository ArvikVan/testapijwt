package arv.consumeapirt.models.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 21.06.2022
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MessagesInfos {
    private List<MessageInfo> data;

    public MessagesInfos() {
    }
    @JsonProperty("data")
    public List<MessageInfo> getDatasList() {
        return data;
    }

    public void setDatasList(List<MessageInfo> data) {
        this.data = data;
    }
}
