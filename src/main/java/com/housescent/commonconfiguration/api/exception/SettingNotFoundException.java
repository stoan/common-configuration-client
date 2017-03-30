package com.housescent.commonconfiguration.api.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.Status.NOT_FOUND;

/**
 * Created by Siya Sosibo on 20-May-16 16:18.
 */
public class SettingNotFoundException extends WebApplicationException {
    public SettingNotFoundException() {
    }

    public SettingNotFoundException(String message) {
        super(Response.status(NOT_FOUND)
                .entity(message).type(MediaType.TEXT_PLAIN).build());
    }

    public SettingNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SettingNotFoundException(Throwable cause) {
        super(cause);
    }
}
