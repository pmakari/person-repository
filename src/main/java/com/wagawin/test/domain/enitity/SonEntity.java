package com.wagawin.test.domain.enitity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author parvizmakarti@gmail.com
 */
@Entity
@DiscriminatorValue("MALE")
@Getter
@Setter
public class SonEntity extends ChildEntity {

    @Column(name = "bicyclecolor", length = 64)
    private String biCycleColor;

}
