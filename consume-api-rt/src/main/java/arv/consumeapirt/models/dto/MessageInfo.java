package arv.consumeapirt.models.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author ArvikV
 * @version 1.0
 * @since 21.06.2022
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageInfo {
    private Long messageID;
    private String text;
    private String senderName;

    public MessageInfo() {
    }

    public Long getMessageID() {
        return messageID;
    }

    public void setMessageID(Long messageID) {
        this.messageID = messageID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }
}
