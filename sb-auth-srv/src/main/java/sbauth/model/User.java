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
    @Column(name = "ID")
    Long id;

    @Column(name = "NAME")
    String name;

    @Column(name = "DESCRIPTION")
    String description;


}

//@JsonComponent