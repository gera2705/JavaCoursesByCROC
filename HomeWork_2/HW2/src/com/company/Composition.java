package com.company;

/**
 * Класс Composition - музыкаьная композиция
 */
public class Composition {

    private String groupName;
    private String compositionName;

    public Composition(String groupName , String compositionName){
        this.compositionName = compositionName;
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCompositionName() {
        return compositionName;
    }

    public void setCompositionName(String compositionName) {
        this.compositionName = compositionName;
    }
}
