package com.snail.designpatternlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.snail.designpatternlearning.BuilderMethod.AppleComputerBuilder;
import com.snail.designpatternlearning.BuilderMethod.Computer;
import com.snail.designpatternlearning.BuilderMethod.Director;
import com.snail.designpatternlearning.BuilderMethod.SurfaceComputerBuilder;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    public void initData(){
        builderMothod();
    }

    public void builderMothod(){
        Director director = new Director(new AppleComputerBuilder());
        Computer computer = director.construct();
        Log.d(TAG, "builderMothod: cpu = " + computer.getCPU());
        Log.d(TAG, "builderMothod: graphics = " + computer.getGraphics());
        Log.d(TAG, "builderMothod: mainBoard = " + computer.getMainBoard());
        Log.d(TAG, "builderMothod: disPlay = " + computer.getDisPlay());

        Director director1 = new Director(new SurfaceComputerBuilder());
        Computer computer1 = director.construct();
        Log.d(TAG, "builderMothod: cpu = " + computer.getCPU());
        Log.d(TAG, "builderMothod: graphics = " + computer.getGraphics());
        Log.d(TAG, "builderMothod: mainBoard = " + computer.getMainBoard());
        Log.d(TAG, "builderMothod: disPlay = " + computer.getDisPlay());
    }
}
