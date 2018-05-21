package com.wagawin.test.domain.enitity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author parvizmakarti@gmail.com
 */
@Entity
@Table(name = "houses", uniqueConstraints = {
    @UniqueConstraint(name = "UNIQUE_HOUSE_ADDRESS_ZIPCODE", columnNames = {"address", "zipcode"})})
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HouseEntity extends BaseEntity {

    @Column(name = "address", length = 255, nullable = false)
    private String address;

    @Column(name = "zipcode", length = 15)
    private String zipCode;

    @Column(name = "housetype", length = 30)
    @Enumerated(EnumType.STRING)
    private HouseType houseType;

    public static enum HouseType {
        FLATE, HOUSE, ESTATE
    }

}
