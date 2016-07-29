package com.android.bottomsheetdialog.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.bottomsheetdialog.R;
import com.android.bottomsheetdialog.listeners.OnMenuItemTapped;
import com.android.bottomsheetdialog.menu.BottomGridMenu;
import com.android.bottomsheetdialog.models.MenuDTO;

import java.util.List;


public class BottomSheetMenuGridAdapter extends RecyclerView.Adapter<BottomSheetMenuGridAdapter.Holder> {
    private Context context;
    private List<MenuDTO> listMenu;
    private OnMenuItemTapped tapListener;
    private BottomGridMenu bottomMenu;

    public BottomSheetMenuGridAdapter(Context context, BottomGridMenu bottomMenu, List<MenuDTO> listMenu, OnMenuItemTapped tapListener) {
        this.context = context;
        this.listMenu = listMenu;
        this.tapListener = tapListener;
        this.bottomMenu = bottomMenu;
    }

    @Override
    public BottomSheetMenuGridAdapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(context).inflate(R.layout.row_menu_item_grid, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        rootView.setLayoutParams(lp);
        return new Holder(rootView);
    }

    @Override
    public void onBindViewHolder(BottomSheetMenuGridAdapter.Holder holder, int position) {
        final MenuDTO menu = listMenu.get(position);
        holder.llMenuLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tapListener != null)
                    tapListener.onClickMenuItem(menu);
                if (bottomMenu != null)
                    bottomMenu.dismiss();
            }
        });
        holder.tvMenuTitle.setText(menu.getMenuTitle());
        holder.ivMenuIcon.setImageResource(menu.getMenuIcon());
    }

    @Override
    public int getItemCount() {
        return listMenu.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        private ImageView ivMenuIcon;
        private LinearLayout llMenuLayout;
        private TextView tvMenuTitle;

        public Holder(View itemView) {
            super(itemView);
            tvMenuTitle = (TextView) itemView.findViewById(R.id.tv_menu_title);
            ivMenuIcon = (ImageView) itemView.findViewById(R.id.iv_menu_icon);
            llMenuLayout = (LinearLayout) itemView.findViewById(R.id.ll_menu_layout);
        }
    }
}
