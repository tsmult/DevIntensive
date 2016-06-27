package com.softdesign.devintensive.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.softdesign.devintensive.R;

public class MainActivity extends AppCompatActivity implements ConstantManager {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                Log.d(TAG_D, "onCreate");

                        if (savedInstanceState == null) {
                        //если создалось впервые
                            }
                 else {

                            }

                                            }


                @Override
        protected void onStart() {
                super.onStart();
                Log.d(TAG_D, "onStart");

                    }

                @Override
        protected void onResume() {
                super.onResume();
                Log.d(TAG_D, "onResume");
            }

                @Override
        protected void onPause() {
                super.onPause();
                Log.d(TAG_D, "onPause");
           }

                @Override
        protected void onStop() {
                super.onStop();
                Log.d(TAG_D, "onStop");

                    }

                @Override
        protected void onDestroy() {
                super.onDestroy();
                Log.d(TAG_D, "onDestroy");
            }
                    @Override
        protected void onRestart() {
                super.onRestart();
                Log.d(TAG_D, "onRestart");
            }




                @Override
        public void onSaveInstanceState(Bundle outState) {
                super.onSaveInstanceState(outState);
                Log.d(TAG_D, "onSaveInstanceState");

    }
}
