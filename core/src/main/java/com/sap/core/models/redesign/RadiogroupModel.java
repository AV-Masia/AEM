package com.sap.core.models.redesign;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = "sap/components/redesign/radiogroup"
)
public class RadiogroupModel {

    @ValueMapValue
    private String size;

    private String result;

    @PostConstruct
    public final void init(){
        result = "You're size: ";
        result = result + size;
    }

    public String getSize() {
        return size;
    }
    public String getResult() {
        return result;
    }
}
