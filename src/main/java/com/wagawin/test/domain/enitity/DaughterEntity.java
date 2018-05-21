package com.wagawin.test.domain.enitity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author parvizmakarti@gmail.com
 */
@Entity
@DiscriminatorValue("FEMALE")
@Getter
@Setter
@NoArgsConstructor
public class DaughterEntity extends ChildEntity {

    @Column(name = "haircolor", length = 64)
    private String hairColor;

}
