package com.android.bottomsheetdialog.menu;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.bottomsheetdialog.R;
import com.android.bottomsheetdialog.adapter.BottomSheetMenuListAdapter;
import com.android.bottomsheetdialog.listeners.OnMenuItemTapped;
import com.android.bottomsheetdialog.models.MenuDTO;

import java.util.List;

public class BottomListMenu extends BottomSheetDialog {
    private List<MenuDTO> menuList;
    private OnMenuItemTapped menuTapListener;

    public BottomListMenu(@NonNull Context context, List<MenuDTO> menuList, OnMenuItemTapped menuTapListener) {
        super(context);
        this.menuList = menuList;
        this.menuTapListener = menuTapListener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_menu_list);
        RecyclerView rcvList = (RecyclerView) findViewById(R.id.rcv_menu_list);

        rcvList.setLayoutManager(new LinearLayoutManager(getContext()));
        BottomSheetMenuListAdapter adapter = new BottomSheetMenuListAdapter(getContext(), this, menuList, menuTapListener);
        rcvList.setAdapter(adapter);

    }


}
