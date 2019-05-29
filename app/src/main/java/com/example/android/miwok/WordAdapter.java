package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter {
    public WordAdapter(Context context, ArrayList<Word> pWords) {
        super(context,0, pWords);
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
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.text1);
        miwokTextView.setText(localWord.getMiwokTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.text2);
        defaultTextView.setText(localWord.getEnglishTranslation());

        return listItemView;
    }
}
