package park.mail.ru.messenger;

/**
 * Created by Ivan on 20.06.2015.
 */
public class Contact {
    public String getNickname() {
        return mNickname;
    }

    public String getStatus() {
        return mStatus;
    }

    public String getBase64EncodedAvatar() {
        return mBase64EncodedAvatar;
    }

    private String mNickname;
    private String mStatus;
    private String mBase64EncodedAvatar;

    public Contact(String mNickname, String mStatus, String mBase64EncodedAvatar) {
        this.mNickname = mNickname;
        this.mStatus = mStatus;
        this.mBase64EncodedAvatar = mBase64EncodedAvatar;
    }
}
