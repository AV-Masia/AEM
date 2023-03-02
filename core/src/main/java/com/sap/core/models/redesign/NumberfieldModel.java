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
        resourceType = "sap/components/redesign/numberfield"
)
public class NumberfieldModel {

    @ValueMapValue
    private String startLevel;
    @ValueMapValue
    private String id;

    private List<String> result;

    @PostConstruct
    public final void init() {
        result = new ArrayList<>();
        result.add(startLevel);
        result.add(id);


    }

    public String getStartLevel() {
        return startLevel;
    }

    public String getId() {
        return id;
    }

    public List<String> getResult() {
        return result;
    }
}
