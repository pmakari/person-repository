package com.wagawin.test.domain.repository.api;

import com.wagawin.test.domain.enitity.ChildEntity;
import com.wagawin.test.domain.repository.MiddleRepository;
import com.wagawin.test.dto.child.ChildInfoResponseDTO;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public interface ChildRepository extends MiddleRepository<ChildEntity, Long> {
//select pe.id, pe.name, ch.id, ch.name, minMeal.name from persons pe join children ch on pe.id = ch.parent_id  join (select * from meals me where me.child_id = 1 order by me.id limit 1) minMeal on ch.id = minMeal.child_id  where ch.id = 1;0
//    @Query(value = "select pe.id, pe.name, ch.id, ch.name, favouriteMeal.name from children ch join persons pe on pe.id = ch.parent_id left  join (select * from meals me where me.child_id = 1 order by me.id ) favouriteMeal on ch.id = favouriteMeal.child_id  where ch.id = 1")

    @Query(value = "select new com.wagawin.test.dto.child.ChildInfoResponseDTO (p.name, p.age, c.name, c.age, m.name, m.invented)"
            + " from ChildEntity c join c.parent p  left outer join c.meals m where c.id = ?1 order by m.id asc")
    List<ChildInfoResponseDTO> findParentWithFavouriteMeal(Long id, Pageable pageable);
}
