package com.wagawin.test.domain.enitity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.*;

/**
 *
 * @author parvizmakarti@gmail.com
 */
@Table(name = "meals")
@Entity
@Getter
@Setter
@Builder
public class MealEntity extends BaseEntity {

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "invented")
    @Temporal(TemporalType.TIMESTAMP)
    private Date invented;
}
