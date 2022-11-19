package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "users", indexes = @Index(columnList = "email"))
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false, unique = true)
    private String password;

    @Column(name = "created_at", nullable = true, columnDefinition = "DEFAULT CURRENT_TIMESTAMP")
    private Date createdAt = new Date();

    public User() {
        super();
    }

    public User(String login, String password, Date createdAt) {
        super();
        this.login = login;
        this.password = password;
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [login=" + login + ", password=" + password + ", createdAt=" + createdAt + "]";
    }
}