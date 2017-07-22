package sbauth.model;

import javax.persistence.*;

/**
 * Created by zskucsak on 22/07/2017.
 */

@Entity
@Table( name=  "SB_USER")
public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    public Long id;


    public String name;
}
