package com.wagawin.test.exception.specific.parentsummary;

import com.wagawin.test.exception.general.NoSuchResourceException;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public class NoParentSummaryException extends NoSuchResourceException {

    public NoParentSummaryException(String message) {
        super(message);
    }

    public NoParentSummaryException(String message, Throwable cause) {
        super(message, cause);
    }

}
