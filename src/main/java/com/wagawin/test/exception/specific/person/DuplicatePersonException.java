package com.wagawin.test.exception.specific.person;

import com.wagawin.test.exception.general.DuplicateResourceException;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public class DuplicatePersonException extends DuplicateResourceException {

    public DuplicatePersonException(String message) {
        super(message);
    }

    public DuplicatePersonException(String message, Throwable cause) {
        super(message, cause);
    }

}
