package com.wagawin.test.exception.specific.house;

import com.wagawin.test.exception.general.DuplicateResourceException;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public class DuplicateHouseException extends DuplicateResourceException {

    public DuplicateHouseException(String message) {
        super(message);
    }

    public DuplicateHouseException(String message, Throwable cause) {
        super(message, cause);
    }

}
