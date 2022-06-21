package arv.consumeapirt.models;

import lombok.AllArgsConstructor;

import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 07.06.2022
 */
@AllArgsConstructor
public class Dat {
  private List<Mess> messList = null;

    public List<Mess> getMessList() {
        return this.messList;
    }

    public void setMessList(List<Mess> messList) {
        this.messList = messList;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Dat)) return false;
        final Dat other = (Dat) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$messList = this.getMessList();
        final Object other$messList = other.getMessList();
        if (this$messList == null ? other$messList != null : !this$messList.equals(other$messList)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Dat;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $messList = this.getMessList();
        result = result * PRIME + ($messList == null ? 43 : $messList.hashCode());
        return result;
    }

    public String toString() {
        return "Dat(messList=" + this.getMessList() + ")";
    }

    public static class Mess {
        private String senderMsid;
        private String text;

        public String getSenderMsid() {
            return senderMsid;
        }

        public void setSenderMsid(String senderMsid) {
            this.senderMsid = senderMsid;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
