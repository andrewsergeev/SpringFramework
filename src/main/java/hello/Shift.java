package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by aelsergeev on 3/24/17.
 */

@Entity
public class Shift {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String shift;

}
