package com.housescent.commonconfiguration.api.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Siya Sosibo on 20-May-16 16:16.
 */
public class DuplicateSettingException extends WebApplicationException {
    public DuplicateSettingException() {
    }

    public DuplicateSettingException(String message) {
        super(Response.status(Response.Status.CONFLICT)
                .entity(message).type(MediaType.TEXT_PLAIN).build());
    }

    public DuplicateSettingException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateSettingException(Throwable cause) {
        super(cause);
    }
}
