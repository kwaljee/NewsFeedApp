package com.example.android.newsfeedapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


class NewsAdapter extends ArrayAdapter<News> {

    NewsAdapter(Context context) {
        super(context, -1, new ArrayList<News>());
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView author = (TextView) convertView.findViewById(R.id.author);
        TextView section = (TextView) convertView.findViewById(R.id.section);

        News news = getItem(position);
        assert news != null;
        title.setText(news.getTitle());
        author.setText(news.getAuthor());
        section.setText(news.getSection());

        return convertView;
    }

}