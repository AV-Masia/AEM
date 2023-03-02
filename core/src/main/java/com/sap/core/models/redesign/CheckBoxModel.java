package com.sap.core.models.redesign;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = "sap/components/redesign/checkbox")

public class CheckBoxModel {

    @ValueMapValue
    private boolean checkbox;

    private String result;

    @PostConstruct
    public final void init() {

        if(checkbox) {
            result = "You choose something";
        } else {
            result = "You most something done";
        }
    }

    public boolean isCheckbox() {
        return checkbox;
    }

    public String getResult() {
        return result;
    }
}
