package com.wagawin.test.dto.person;

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
public class PersonDTO {

    private String name;

    private Short age;
}
