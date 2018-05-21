package com.wagawin.test.service.api;

import com.wagawin.test.dto.child.ChildInfoResponseDTO;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public interface ChildService {

    ChildInfoResponseDTO findParentWithFavouriteMeal(Long id);

    String findChildColor(Long id);
}
