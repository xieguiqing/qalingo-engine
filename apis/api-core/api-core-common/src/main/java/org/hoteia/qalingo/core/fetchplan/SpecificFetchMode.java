package org.hoteia.qalingo.core.fetchplan;

import org.hibernate.FetchMode;

public class SpecificFetchMode {

    private String assocationPath;
    private FetchMode fetchMode;
    private SpecificAlias requiredAlias;
    
    public SpecificFetchMode(String assocationPath) {
        this.assocationPath = assocationPath;
    }
    
    public SpecificFetchMode(String assocationPath, SpecificAlias alias) {
        this.assocationPath = assocationPath;
        
        // BIND ALIAS
        alias.setAlias(assocationPath);
        this.requiredAlias = alias;
    }
    
    public String getAssocationPath() {
        return assocationPath;
    }
    
    public void setAssocationPath(String assocationPath) {
        this.assocationPath = assocationPath;
    }

    public FetchMode getFetchMode() {
        if(fetchMode == null){
            return FetchMode.JOIN;
        }
        return fetchMode;
    }

    public void setFetchMode(FetchMode fetchMode) {
        this.fetchMode = fetchMode;
    }

    public SpecificAlias getRequiredAlias() {
        return requiredAlias;
    }

    public void setRequiredAlias(SpecificAlias requiredAlias) {
        this.requiredAlias = requiredAlias;
    }
    
}