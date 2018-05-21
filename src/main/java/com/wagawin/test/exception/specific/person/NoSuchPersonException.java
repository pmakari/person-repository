package com.wagawin.test.exception.specific.person;

import com.wagawin.test.exception.general.NoSuchResourceException;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public class NoSuchPersonException extends NoSuchResourceException {

    public NoSuchPersonException(String message) {
        super(message);
    }

    public NoSuchPersonException(String message, Throwable cause) {
        super(message, cause);
    }

}
