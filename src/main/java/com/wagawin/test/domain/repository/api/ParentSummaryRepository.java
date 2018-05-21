package com.wagawin.test.domain.repository.api;

import com.wagawin.test.domain.enitity.ParentSummaryEntity;
import com.wagawin.test.domain.repository.MiddleRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public interface ParentSummaryRepository extends MiddleRepository<ParentSummaryEntity, Long> {

    @Query(value = "select count(hc) as amountOfPersons , hc as amountOfChildren from "
            + " (select parent_id, count(parent_id) hc from children group by parent_id ) children group by hc", nativeQuery = true)
    public List<Object[]> calculateParentsAndChildrenCount();
}
