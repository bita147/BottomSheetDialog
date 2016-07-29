package com.android.bottomsheetdialog.utils;

import android.content.Context;

import com.android.bottomsheetdialog.R;
import com.android.bottomsheetdialog.models.MenuDTO;

import java.util.ArrayList;
import java.util.List;


public class MenuUtils {
    private  static List<MenuDTO> menuList = new ArrayList<>();

    public  static  List<MenuDTO> getListMenu(Context context){
        menuList.clear();
        menuList.add(new MenuDTO(R.drawable.ic_edit, context.getString(R.string.menu_edit)));
        menuList.add(new MenuDTO(R.drawable.ic_delete, context.getString(R.string.menu_delete)));
        menuList.add(new MenuDTO(R.drawable.ic_attach, context.getString(R.string.menu_attach)));
        return menuList;
    }

    public  static  List<MenuDTO> getGridMenu(Context context){
        menuList.clear();
        menuList.add(new MenuDTO(R.drawable.ic_edit, context.getString(R.string.menu_edit)));
        menuList.add(new MenuDTO(R.drawable.ic_delete, context.getString(R.string.menu_delete)));
        menuList.add(new MenuDTO(R.drawable.ic_attach, context.getString(R.string.menu_attach)));
        return menuList;
    }
}
