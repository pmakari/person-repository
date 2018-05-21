package com.wagawin.test.exception.general;

import com.wagawin.test.exception.BusinessException;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public class DuplicateResourceException extends BusinessException {

    public DuplicateResourceException(String message) {
        super(message);
    }

    public DuplicateResourceException(String message, Throwable cause) {
        super(message, cause);
    }

}
