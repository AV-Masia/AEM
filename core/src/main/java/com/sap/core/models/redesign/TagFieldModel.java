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
        resourceType = "sap/components/redesign/tagfield")

public class TagFieldModel {

    @ValueMapValue
    private String[] tagNames;

    private List<String> result;

    @PostConstruct
    public final void init() {

        result = new ArrayList<>();
        for (String str: tagNames
             ) { if(!str.isEmpty()) {
                 result.add(str);
        } else {
                 result.add("You most something chosen");
        }

        }
    }

    public List<String> getResult() {
        return result;
    }

    public String[] getTagNames() {
        return tagNames;
    }
}
