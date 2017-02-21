package com.housescent.commonconfiguration.api.service;

import javax.ejb.EJB;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

@Dependent
public class ConfigurationServiceRemoteProducer {

    @Produces
    @EJB(lookup = "java:global/" + ConfigurationServiceRemote.APP_NAME + "/" + ConfigurationServiceRemote.MODULE_NAME + "/" + ConfigurationServiceRemote.BEAN_NAME + "!" + ConfigurationServiceRemote.VIEW_CLASS_NAME)
    private ConfigurationServiceRemote serviceRemote;
}
