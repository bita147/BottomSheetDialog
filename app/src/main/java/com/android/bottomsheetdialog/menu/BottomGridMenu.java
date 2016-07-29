package com.android.bottomsheetdialog.menu;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.bottomsheetdialog.R;
import com.android.bottomsheetdialog.adapter.BottomSheetMenuGridAdapter;
import com.android.bottomsheetdialog.listeners.OnMenuItemTapped;
import com.android.bottomsheetdialog.models.MenuDTO;

import java.util.List;


public class BottomGridMenu extends BottomSheetDialog {
    private List<MenuDTO> menuList;
    private OnMenuItemTapped menuTapListener;

    public BottomGridMenu(@NonNull Context context, List<MenuDTO> menuList, OnMenuItemTapped menuTapListener) {
        super(context);
        this.menuList = menuList;
        this.menuTapListener = menuTapListener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_menu_list);
        RecyclerView rcvList = (RecyclerView) findViewById(R.id.rcv_menu_list);

        rcvList.setLayoutManager(new GridLayoutManager(getContext(),3));
        BottomSheetMenuGridAdapter adapter = new BottomSheetMenuGridAdapter(getContext(), this, menuList, menuTapListener);
        rcvList.setAdapter(adapter);

    }


}
