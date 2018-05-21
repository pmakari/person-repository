package com.wagawin.test.exception.general;

import com.wagawin.test.exception.BusinessException;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public class NoSuchResourceException extends BusinessException {

    public NoSuchResourceException(String message) {
        super(message);
    }

    public NoSuchResourceException(String message, Throwable cause) {
        super(message, cause);
    }

}
