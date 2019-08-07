package com.epiuse.recruiting.service.odata;

import org.apache.olingo.odata2.core.rest.ODataRootLocator;

import javax.ws.rs.Path;

@Path("/")
public class RootLocator extends ODataRootLocator {
    private ODataServiceFactory serviceFactory;

    public RootLocator(ODataServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @Override
    public ODataServiceFactory getServiceFactory() {
        return this.serviceFactory;
    }
}
