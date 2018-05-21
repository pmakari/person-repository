package com.wagawin.test.dto.meal;

import java.util.Date;
import lombok.*;

/**
 *
 * @author parvizmakarti@gmail.com
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MealDTO {

    private String name;

    private Date invented;
}
