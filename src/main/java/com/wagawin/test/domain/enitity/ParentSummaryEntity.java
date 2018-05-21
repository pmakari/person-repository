package com.wagawin.test.domain.enitity;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "parentsummary")
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParentSummaryEntity extends BaseEntity {

    @Column(name = "persons_count", nullable = false)
    private Long amountOfPersons;

    @Column(name = "children_count", nullable = false)
    private Long amountOfChildren;

}
