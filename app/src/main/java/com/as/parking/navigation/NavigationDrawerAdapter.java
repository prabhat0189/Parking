package com.as.parking.navigation;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.as.parking.R;

/**
 * Created by PRABHAT on 8/23/2015.
 */
public class NavigationDrawerAdapter extends ArrayAdapter<String> {


    Context context;
    String[] listItems;

    public NavigationDrawerAdapter(Context context, int resourceId, //resourceId=your layout
                                   String[] items) {
        super(context, resourceId, items);
        this.context = context;
        listItems = items;
    }

    /*private view holder class*/
    private class ViewHolder {
        ImageView imageView;
        TextView txtTitle;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.drawer_list_item, parent, false);
            holder = new ViewHolder();
            holder.txtTitle = (TextView) convertView.findViewById(R.id.title);
            holder.imageView = (ImageView) convertView.findViewById(R.id.icon);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.txtTitle.setText(listItems[position]);
        int mDrawbleResId = context.getResources().getIdentifier(listItems[position].toLowerCase(), "drawable", context.getPackageName());
        holder.imageView.setImageResource(mDrawbleResId);

        return convertView;
    }
}
