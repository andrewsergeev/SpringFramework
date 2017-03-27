package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by aelsergeev on 3/24/17.
 */
@Entity
public class Weekend {


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWeekend() {
        return weekend;
    }

    public void setWeekend(String weekend) {
        this.weekend = weekend;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String weekend;
}
