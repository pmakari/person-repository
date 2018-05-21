package com.wagawin.test.domain.enitity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author parvizmakarti@gmail.com
 */
@Table(name = "children")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "sex", discriminatorType = DiscriminatorType.STRING)
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChildEntity extends BaseEntity {

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "age")
    private Short age;

    @JoinColumn(name = "parent_id", foreignKey = @ForeignKey(name = "FK_CHILD_TO_PERSON"))
    @ManyToOne(fetch = FetchType.LAZY)
    private PersonEntity parent;

    @JoinColumn(name = "child_id", foreignKey = @ForeignKey(name = "FK_MEAL_TO_CHILD"))
    @OneToMany
    private List<MealEntity> meals;

}
