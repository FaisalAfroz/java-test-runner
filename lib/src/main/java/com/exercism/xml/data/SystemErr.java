package com.exercism.xml.data;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import com.google.common.base.MoreObjects;

public class SystemErr {
    @JacksonXmlText
    public String value;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("value", value)
            .toString(); 
    }
}
