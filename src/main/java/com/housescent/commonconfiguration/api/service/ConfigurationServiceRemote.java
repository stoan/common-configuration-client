package com.housescent.commonconfiguration.api.service;

import com.housescent.commonconfiguration.api.exception.DuplicateSettingException;
import com.housescent.commonconfiguration.api.exception.SettingNotFoundException;

import java.util.Map;

/**
 * Created by Siya Sosibo on 13-Jan-16.
 */
public interface ConfigurationServiceRemote {

    String APP_NAME = "common-configuration";
    String MODULE_NAME = "common-configuration-service";
    String BEAN_NAME = "ConfigurationServiceImpl";
    String VIEW_CLASS_NAME =  "com.housescent.commonconfiguration.api.service.ConfigurationServiceRemote";

    /**
     * Retrieves the value of a single property for a particular application and key.
     *
     * @param applicationName the application chosen name, under which the setting is stored.
     * @param key             the key under which the setting is stored.
     * @return the value for a single property for the specified <code>applicationName</code> and
     * <code>key</code>.
     */
    String getPropertyValue(String applicationName, String key) throws DuplicateSettingException, SettingNotFoundException;

    /**
     * Retrieves a list of common for a particular application as <code>Map</code>
     *
     * @param applicationName the application chosen name, under which the setting is stored.
     * @return a map of setting key-value pairs for the specified <code>applicationName</code>.
     */
    Map<String, String> getPropertiesForApplicationAsMap(String applicationName) throws DuplicateSettingException, SettingNotFoundException;
}
