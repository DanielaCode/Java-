package model;

import java.util.Date;

public interface IScheduable {
    void schedule(Date date,String time);// interfaces are focus on add behavior to a class these methods here can be used and are used to make composition the difference between interfaces and classes is that interfaces can be applied to any family not only one inheritance chain, interfaces only have constants ande methods signatures
}
