package com.example;

import android.os.AsyncTask;

public class MyAsyncTask extends AsyncTask<Void, Void, String>  {

    ResultsListener listener;

    public void setOnResultsListener(ResultsListener listener) {
        this.listener = listener;
    }

    @Override
    protected String doInBackground(Void... voids) {
        String someString = "foo bar";
        return someString.subSequence(3, 5).toString();

    }

    @Override
    protected void onPostExecute(String result) {
       listener.onResultsSucceeded(result);

    }


}