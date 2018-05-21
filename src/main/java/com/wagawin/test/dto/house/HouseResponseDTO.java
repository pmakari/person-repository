package com.wagawin.test.dto.house;

import com.wagawin.test.dto.BaseResponseDTO;
import lombok.*;

/**
 *
 * @author parvizmakarti@gmail.com
 */
@Getter
@Setter
@Builder
public class HouseResponseDTO extends BaseResponseDTO {

    private String address;
    private String zipCode;
    private String houseType;

}
