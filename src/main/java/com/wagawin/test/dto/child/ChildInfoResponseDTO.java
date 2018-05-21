package com.wagawin.test.dto.child;

import com.wagawin.test.dto.meal.MealDTO;
import com.wagawin.test.dto.person.PersonDTO;
import java.util.Date;
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
public class ChildInfoResponseDTO {

    public ChildInfoResponseDTO(String parentName, Short parentAge, String childName, Short childAge, String favouriteMealName, Date invented) {
        this.parent = new PersonDTO(parentName, parentAge);
        this.child = new PersonDTO(childName, childAge);
        this.favouriteMeal = new MealDTO(favouriteMealName, invented);
    }

    private PersonDTO parent;
    private PersonDTO child;
    private MealDTO favouriteMeal;
}
