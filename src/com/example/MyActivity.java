package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * The Activity implements the ResultsListener interface
 * which is called in OnPostExecute of
 * the AsyncTask.
 */
public class MyActivity extends Activity  implements ResultsListener
{



    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        MyAsyncTask task = new MyAsyncTask();
        /**
         * Set this Activity as the listener
         * on the AsyncTask. The AsyncTask will now
         * have a refence to this Activity and will
         * call onResultsSucceeded() in its
         * onPostExecute method.
         */
        task.setOnResultsListener(this);
        task.execute();
    }

    public void onResultsSucceeded(String result) {
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }
}

