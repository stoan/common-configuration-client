package com.housescent.commonconfiguration.api.exception;

/**
 * Created by F4902718 - Siya Sosibo on 20-May-16 16:18.
 */
public class SettingNotFoundException extends SettingsException {
    public SettingNotFoundException() {
    }

    public SettingNotFoundException(String message) {
        super(message);
    }

    public SettingNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SettingNotFoundException(Throwable cause) {
        super(cause);
    }
}
