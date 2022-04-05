package facade;


import org.apache.commons.lang3.RandomStringUtils;

public class Message {
    private String uuid;
    private String value;

    public String getUuid() {
        return uuid;
    }

    public String getValue() {
        return value;
    }

    public Message(String value) {
        this.uuid = getRandomName();
        this.value = value;
    }

    private String getRandomName() {
        return RandomStringUtils.randomAlphanumeric(10) + ".html";
    }
}
