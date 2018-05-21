package com.wagawin.test.service.api;

import com.wagawin.test.dto.parentsummary.ParentSummaryDTO;
import java.util.List;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public interface ParentSummaryService {

    List<ParentSummaryDTO> getParentSummary();

    void calculateParentSummary();
}
