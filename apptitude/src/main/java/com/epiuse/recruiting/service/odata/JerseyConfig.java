package com.epiuse.recruiting.service.odata;

import org.apache.olingo.odata2.core.rest.ODataRootLocator;
import org.apache.olingo.odata2.core.rest.app.ODataApplication;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;
import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/odata.svc")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(ODataServiceFactory serviceFactory, EntityManagerFactory emf) {
        ODataApplication app = new ODataApplication();

        app.getClasses().forEach(c -> {
            if (!ODataRootLocator.class.isAssignableFrom(c)) {
                register(c);
            }
        });

        register(new RootLocator(serviceFactory));
        register(new EntityManagerFilter(emf));
    }
}
