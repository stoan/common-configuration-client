package com.housescent.commonconfiguration.api.exception;

/**
 * Created by Siya Sosibo on 20-May-16 16:18.
 */
public class SettingsException extends Exception {

    public SettingsException() {
        super();
    }

    public SettingsException(String message) {
        super(message);
    }

    public SettingsException(String message, Throwable cause) {
        super(message, cause);
    }

    public SettingsException(Throwable cause) {
        super(cause);
    }
}
