package com.wagawin.test.dto.parentsummary;

import lombok.*;

/**
 *
 * @author parvizmakarti@gmail.com
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParentSummaryDTO {

    private Long amountOfPersons;

    private Long amountOfChildren;

}
