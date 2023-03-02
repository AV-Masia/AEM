package com.sap.core.models.redesign;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = "sap/components/redesign/textfield")
public class TextFieldModel {

    @ValueMapValue
    private String text;
    @ValueMapValue
    private String text1;

    private String result;

    @PostConstruct
    public final void init() {
        result = "result sentences: ";
        result = result + text + " " + text1;
    }

    public String getResult() {
        return result;
    }

    public String getText() {
        return text;
    }

    public String getText1() {
        return text1;
    }
}
