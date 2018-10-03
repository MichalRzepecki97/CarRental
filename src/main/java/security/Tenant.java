package security;

import org.h2.engine.User;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    @Column(unique = true)
    private String login;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
}
