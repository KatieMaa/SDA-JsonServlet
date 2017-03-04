package pl.sda.entities;

import java.util.UUID;

/**
 * Created by RENT on 2017-03-04.
 */
public class User {

    private String login;
    private String name;
    private String mail;
    private UUID id;

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {

        return id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }
}
