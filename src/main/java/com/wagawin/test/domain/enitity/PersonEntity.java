package com.wagawin.test.domain.enitity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author parvizmakarti@gmail.com
 */
@Table(name = "persons", uniqueConstraints = {
    @UniqueConstraint(name = "UNIQUE_PERSON_HOUSEID", columnNames = {"house_id"})})
@Entity
@Getter
@Setter
public class PersonEntity extends BaseEntity {

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "age")
    private Short age;

    @JoinColumn(name = "house_id", foreignKey = @ForeignKey(name = "FK_PERSON_HOUSE"))
    @OneToOne(fetch = FetchType.LAZY)
    private HouseEntity house;

}
