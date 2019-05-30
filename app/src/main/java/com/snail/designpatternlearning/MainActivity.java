package com.snail.designpatternlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.snail.designpatternlearning.AbstractBuilderMethod.MobilePhone;
import com.snail.designpatternlearning.BuilderMethod.AppleComputerBuilder;
import com.snail.designpatternlearning.BuilderMethod.Computer;
import com.snail.designpatternlearning.BuilderMethod.Director;
import com.snail.designpatternlearning.BuilderMethod.SurfaceComputerBuilder;
import com.snail.designpatternlearning.SingleInstanceMethod.Book;
import com.snail.designpatternlearning.SingleInstanceMethod.Car;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    public void initData() {
        /**
         * 建造者模式
         */
        builderMothod();

        /**
         * 建造者模式的链式调用
         */
        buildAbstractMathod();
    }

    public void builderMothod() {
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

    public void buildAbstractMathod() {
        MobilePhone mobilePhone = new MobilePhone.Builder()
                .CPU("A12")
                .Display("2K")
                .MainBoard("Apple")
                .Graphics("A12")
                .build();

    }


    public void singelInstanceMathod(){
        /**
         * 懒汉单例模式
         */
        Car car = Car.getInstance();

        /**
         * 恶汉单例模式
         */
        Book book = Book.getInstance();
    }
}
