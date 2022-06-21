
package arv.consumeapirt.models;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;

/**
 * класс описывающий модель сообщения
 * тип messageID изменен на Long
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Datum {
    @JsonProperty("messageID")
    private Long messageID;
    private String creationDate;
    private String type;
    private String text;
    @JsonProperty("messageID")
    public Long getMessageID() {
        return messageID;
    }

    @JsonProperty("messageID")
    public void setMessageID(Long messageID) {
        this.messageID = messageID;
    }

    @JsonProperty("creationDate")
    public String getCreationDate() {
        return creationDate;
    }

    @JsonProperty("creationDate")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }
}
