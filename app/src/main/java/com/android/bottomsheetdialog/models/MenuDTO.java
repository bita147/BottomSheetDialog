package com.android.bottomsheetdialog.models;

import java.io.Serializable;


public class MenuDTO implements Serializable {
    private int menuIcon;
    private String menuTitle;

    public MenuDTO(int menuIcon, String menuTitle) {
        this.menuIcon = menuIcon;
        this.menuTitle = menuTitle;
    }

    public int getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(int menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }
}
