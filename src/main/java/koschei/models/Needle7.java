package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Needle7 {
    private final Death8 death;

    @Autowired
    public Needle7(Death8 death) {
        this.death = death;
        //dsadsa
    }


    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + death.toString();
    }
}
