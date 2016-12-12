package com.example.android.newsfeedapp;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

import java.io.IOException;
import java.net.URL;
import java.util.List;

class NewsLoader extends AsyncTaskLoader<List<News>> {

    NewsLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        List<News> list = null;
        try {
            URL url = ProcessJSON.createUrl();
            String jsonResponse = ProcessJSON.makeHttpRequest(url);
            list = ProcessJSON.parseJson(jsonResponse);
        } catch (IOException e) {
            Log.e("ProcessJSON", "Error Loader LoadInBackground: ", e);
        }
        return list;
    }
}