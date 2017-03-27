package hello;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="users")
public class Users {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public Subdivision getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(Subdivision subdivision) {
        this.subdivision = subdivision;
    }

    public Weekend getWeekend() {
        return weekend;
    }

    public void setWeekend(Weekend weekend) {
        this.weekend = weekend;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Long getAdm_user_id() {
        return adm_user_id;
    }

    public void setAdm_user_id(Long adm_user_id) {
        this.adm_user_id = adm_user_id;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String surname;
    private String name;
    private String username;
    private String email;
    private String skype;
    private Long phone;
    @ManyToOne
    private Shift shift;
    @ManyToOne
    private Subdivision subdivision;
    @ManyToOne
    private Weekend weekend;

    @Column(name="birthday")
    @Temporal(value=TemporalType.DATE)
    private Date birthday;
    private Long adm_user_id;


}
