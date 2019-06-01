package com.example.android.miwok;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static android.view.View.GONE;
import static java.sql.Types.NULL;

public class WordAdapter extends ArrayAdapter {
    private int mColorResourceId;
    public WordAdapter(Context context, ArrayList<Word> pWords,int colorResourceId) {
        super(context,0, pWords);
        mColorResourceId=colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word localWord = (Word) getItem(position);
        View forColor = listItemView.findViewById(R.id.for_color);
        int color =  ContextCompat.getColor(getContext(),mColorResourceId);
        forColor.setBackgroundColor(color);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.text1);
        miwokTextView.setText(localWord.getMiwokTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.text2);
        defaultTextView.setText(localWord.getEnglishTranslation());
        ImageView icon = (ImageView) listItemView.findViewById(R.id.photo1);
        icon.setVisibility(GONE);
        if(localWord.getImageResourceId()!=NULL) {
            icon.setVisibility(View.VISIBLE);
            icon.setImageResource(localWord.getImageResourceId());
        }


        return listItemView;
    }
}
