package com.sap.core.models.redesign;


import lombok.extern.slf4j.Slf4j;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Slf4j
@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = "sap/components/redesign/select")

public class SelectModel {

    @ValueMapValue
    private String[] multiselect;

    @ValueMapValue
    private String select;

    private List<String> result;
    private List<String> resultMultiselect;

    @PostConstruct
    public final void init() {

        resultMultiselect = multiselect != null ? Arrays.asList(multiselect) : Collections.emptyList();

        result = new ArrayList<>();
        for ( String object: resultMultiselect
             ) {
                if (object.equals("FULL_WINDOW")) {
                    result.add("Result = FULL_WINDOW and it works");
                }
                if (object.equals("SIZED_CONTAINER")) {
                    result.add("Result = SIZED_CONTAINER and it works egan");
                }
                if (object.equals("IN_LINE")) {
                    result.add("Result = IN_LINE and it's wonderful");
                }
            }
        }


    public String[] getMultiselect() {
        return multiselect;
    }
    public List <String> getResultMultiselect() {
        return resultMultiselect;
    }

    public String getSelect() {
        return select;
    }

    public List<String> getResult() {
        return result;
    }

}
