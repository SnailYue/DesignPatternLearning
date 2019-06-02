package com.snail.designpatternlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.snail.designpatternlearning.AbstractBuilderMethod.MobilePhone;
import com.snail.designpatternlearning.AdapterMethod.Adapter;
import com.snail.designpatternlearning.AdapterMethod.TypeC;
import com.snail.designpatternlearning.AdapterMethod.TypeCAdapter;
import com.snail.designpatternlearning.AdapterMethod.Usb;
import com.snail.designpatternlearning.BuilderMethod.AppleComputerBuilder;
import com.snail.designpatternlearning.BuilderMethod.Computer;
import com.snail.designpatternlearning.BuilderMethod.Director;
import com.snail.designpatternlearning.BuilderMethod.SurfaceComputerBuilder;
import com.snail.designpatternlearning.IteratorMethod.Iterator;
import com.snail.designpatternlearning.IteratorMethod.Phone;
import com.snail.designpatternlearning.IteratorMethod.PhoneCollection;
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
        builderMothod();
        buildAbstractMathod();
        singelInstanceMathod();
        iteratorMathod();
        adapterMathod();
    }


    /**
     * 建造者模式
     */
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


    /**
     * 建造者模式的链式调用
     */
    public void buildAbstractMathod() {
        MobilePhone mobilePhone = new MobilePhone.Builder()
                .CPU("A12")
                .Display("2K")
                .MainBoard("Apple")
                .Graphics("A12")
                .build();

    }


    /**
     * 单例模式
     */
    public void singelInstanceMathod() {
        /**
         * 懒汉单例模式
         */
        Car car = Car.getInstance();

        /**
         * 恶汉单例模式
         */
        Book book = Book.getInstance();
    }

    /**
     * 迭代器模式
     */

    public void iteratorMathod() {
        PhoneCollection<Phone> phoneCollection = new PhoneCollection<>();
        phoneCollection.add(new Phone("Apple", "High", 8899));
        phoneCollection.add(new Phone("HUAWEI", "Hight", 10299));

        Iterator<Phone> iterator = phoneCollection.iterator();
        while (iterator.hasNext()) {
            Log.d(TAG, "iteratorMathod: " + iterator.next());
        }

    }

    /**
     * 适配器模式
     */
    public void adapterMathod(){
        Adapter<TypeC> adapter = new TypeCAdapter(new Usb("this is usb data"));
        Log.d(TAG, "adapterMathod: type C data : " +((TypeCAdapter) adapter).getTransformObject());
    }
}
