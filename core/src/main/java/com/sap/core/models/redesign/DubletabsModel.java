package com.sap.core.models.redesign;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = "sap/components/redesign/dubletabs"
)
public class DubletabsModel {
    @ValueMapValue
    private String richtext1;
    @ValueMapValue
    private String richtext2;

    private List<String> result;

    @PostConstruct
    public final void init() {
        result = new ArrayList<>();
        result.add(richtext1);
        result.add(richtext2);
    }

    public String getRichtext1() {
        return richtext1;
    }

    public String getRichtext2() {
        return richtext2;
    }

    public List<String> getResult() {
        return result;
    }
}
