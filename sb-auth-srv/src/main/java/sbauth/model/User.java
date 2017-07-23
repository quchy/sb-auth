package sbauth.model;

import lombok.*;
import lombok.extern.java.Log;

import javax.persistence.*;

/**
 * Created by zskucsak on 22/07/2017.
 */

@Entity
@Table( name=  "SB_USER")
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Log
@Builder
public class User  {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "id")
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "Description")
    String description;

   // public void User() {}
}

//@JsonComponent