package com.sap.core.models.redesign;

import com.drew.lang.annotations.Nullable;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = "sap/components/redesign/datepicker")

public class DatepickerModel {


    @ValueMapValue
    private Date datepickerStart;

    @ValueMapValue
    private Date datepickerEnd;

    private String result;

    @PostConstruct
    public final void init() {
     if(datepickerStart !=null & datepickerEnd !=null) {
         Long time = datepickerEnd.getTime() - datepickerStart.getTime();
         Long resultTime = time/60000/60/24;

         result = resultTime.toString();

     }
    }

    public Date getDatepickerStart() {
        return datepickerStart;
    }

    public Date getDatepickerEnd() {
        return datepickerEnd;
    }

    public String getResult() {
        return result;
    }
}
