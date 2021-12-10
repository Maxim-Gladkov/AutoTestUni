package org.testuni.dishwasher;

import java.util.ArrayList;

public  class Tableware {


    private Boolean clean;
    private String type;


    public Tableware(Boolean clean, String type) {
        this.clean = clean;
        this.type = type;
    }

    public Boolean getClean() {
        return clean;
    }

    public String getType() {
        return type;
    }
//попробовать создать ENUM со списком столовой посуды

}
