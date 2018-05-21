package com.wagawin.test.exception.specific.house;

import com.wagawin.test.exception.general.NoSuchResourceException;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public class NoSuchHouseException extends NoSuchResourceException {

    public NoSuchHouseException(String message) {
        super(message);
    }

    public NoSuchHouseException(String message, Throwable cause) {
        super(message, cause);
    }

}
