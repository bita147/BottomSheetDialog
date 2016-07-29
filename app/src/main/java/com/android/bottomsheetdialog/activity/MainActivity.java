package com.android.bottomsheetdialog.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.android.bottomsheetdialog.R;
import com.android.bottomsheetdialog.listeners.OnMenuItemTapped;
import com.android.bottomsheetdialog.menu.BottomGridMenu;
import com.android.bottomsheetdialog.menu.BottomListMenu;
import com.android.bottomsheetdialog.models.MenuDTO;
import com.android.bottomsheetdialog.utils.MenuUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_list_sheet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomListMenu menu = new BottomListMenu(MainActivity.this, MenuUtils.getListMenu(MainActivity.this), new OnMenuItemTapped() {
                    @Override
                    public void onClickMenuItem(MenuDTO menu) {
                        if (menu.getMenuTitle().equals(getString(R.string.menu_edit))) {
                            Toast.makeText(MainActivity.this, "Edit Clicked", Toast.LENGTH_SHORT).show();
                        } else if (menu.getMenuTitle().equals(getString(R.string.menu_delete))) {
                            Toast.makeText(MainActivity.this, "Delete Clicked", Toast.LENGTH_SHORT).show();
                        } else if (menu.getMenuTitle().equals(getString(R.string.menu_attach))) {
                            Toast.makeText(MainActivity.this, "Attach Clicked", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                menu.show();
            }
        });

        findViewById(R.id.btn_grid_sheet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomGridMenu menu = new BottomGridMenu(MainActivity.this, MenuUtils.getGridMenu(MainActivity.this), new OnMenuItemTapped() {
                    @Override
                    public void onClickMenuItem(MenuDTO menu) {
                        if (menu.getMenuTitle().equals(getString(R.string.menu_edit))) {
                            Toast.makeText(MainActivity.this, "Edit Clicked", Toast.LENGTH_SHORT).show();
                        } else if (menu.getMenuTitle().equals(getString(R.string.menu_delete))) {
                            Toast.makeText(MainActivity.this, "Delete Clicked", Toast.LENGTH_SHORT).show();
                        } else if (menu.getMenuTitle().equals(getString(R.string.menu_attach))) {
                            Toast.makeText(MainActivity.this, "Attach Clicked", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                menu.show();
            }
        });

    }
}
