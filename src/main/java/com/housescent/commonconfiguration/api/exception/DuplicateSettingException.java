package com.housescent.commonconfiguration.api.exception;

/**
 * Created by Siya Sosibo on 20-May-16 16:16.
 */
public class DuplicateSettingException extends SettingsException {
    public DuplicateSettingException() {
    }

    public DuplicateSettingException(String message) {
        super(message);
    }

    public DuplicateSettingException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateSettingException(Throwable cause) {
        super(cause);
    }
}
