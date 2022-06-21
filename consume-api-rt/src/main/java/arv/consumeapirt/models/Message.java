
package arv.consumeapirt.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
    @JsonProperty("data")
    private List<Datum> data = null;
    public Message() {
    }
    public Message(List<Datum> data) {
        this.data = data;
    }
    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }
    @JsonProperty("data")
    public void setData(List<Datum> data) {
        this.data = data;
    }
}
