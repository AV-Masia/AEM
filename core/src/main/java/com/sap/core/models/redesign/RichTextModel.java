package com.sap.core.models.redesign;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = "sap/components/redesign/richtext"
)
public class RichTextModel {

    @ValueMapValue
    private String richtext1;

    private String result;

    @PostConstruct
    public final void init() {
        result = "result: ";
        result = result + richtext1;
    }

    public String getResult() {
        return result;
    }

    public String getRichtext1() {
        return richtext1;
    }
}
