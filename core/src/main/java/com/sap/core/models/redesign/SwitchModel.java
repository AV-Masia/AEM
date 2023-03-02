package com.sap.core.models.redesign;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = "sap/components/redesign/switch")

public class SwitchModel {

    @ValueMapValue
    private Boolean linkUrlTarget;

    private String result;

    @PostConstruct
    public final void init() {
        if(linkUrlTarget) {
             result = "Boolean result: True";
        } else { result = "Boolean result: False";}
    }

    public Boolean getLinkUrlTarget() {
        return linkUrlTarget;
    }

    public String getResult() {
        return result;
    }
}
