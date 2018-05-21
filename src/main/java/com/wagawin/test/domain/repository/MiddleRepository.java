package com.wagawin.test.domain.repository;

import com.wagawin.test.domain.enitity.BaseEntity;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author parvizmakarti@gmail.com
 */
@NoRepositoryBean
public interface MiddleRepository<T extends BaseEntity, ID extends Serializable> extends JpaRepository<T, ID> {

}
