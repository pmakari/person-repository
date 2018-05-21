package com.wagawin.test.exception.specific.child;

import com.wagawin.test.exception.general.NoSuchResourceException;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public class NoSuchChildException extends NoSuchResourceException {

    public NoSuchChildException(String message) {
        super(message);
    }

    public NoSuchChildException(String message, Throwable cause) {
        super(message, cause);
    }

}
