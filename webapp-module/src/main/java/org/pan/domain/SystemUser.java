package org.pan.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Created by panmingzhi on 1/11/15.
 */
@Entity
@Table(
        uniqueConstraints={@UniqueConstraint(columnNames = {"username"})}
)
public class SystemUser extends DomainObject {

    private String username;
    private String password;
    private String nickname;
    private String phone;
    private String qq;
    private String email;
    @ManyToOne
    private SystemUserImage systemUserImage;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SystemUserImage getSystemUserImage() {
        return systemUserImage;
    }

    public void setSystemUserImage(SystemUserImage systemUserImage) {
        this.systemUserImage = systemUserImage;
    }
}
