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
import com.snail.designpatternlearning.FactoryMethod.Factory;
import com.snail.designpatternlearning.FactoryMethod.IDCardFactory;
import com.snail.designpatternlearning.FactoryMethod.Product;
import com.snail.designpatternlearning.IteratorMethod.Iterator;
import com.snail.designpatternlearning.IteratorMethod.Phone;
import com.snail.designpatternlearning.IteratorMethod.PhoneCollection;
import com.snail.designpatternlearning.SimpleFactoryMethod.EasyFactory;
import com.snail.designpatternlearning.SimpleFactoryMethod.Operation;
import com.snail.designpatternlearning.SingleInstanceMethod.Book;
import com.snail.designpatternlearning.SingleInstanceMethod.Car;
import com.snail.designpatternlearning.TemplateMethod.BMWCar;
import com.snail.designpatternlearning.TemplateMethod.BenzCar;
import com.snail.designpatternlearning.TemplateMethod.CarTemplate;

/**
 * @Author Snail
 * Date 2019/6/3
 * Email yuesnail@gmail.com
 */

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
        templateMethod();
        simpleFactoryMethod();
        factoryMethod();
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
    public void adapterMathod() {
        Adapter<TypeC> adapter = new TypeCAdapter(new Usb("this is usb data"));
        Log.d(TAG, "adapterMathod: type C data : " + ((TypeCAdapter) adapter).getTransformObject());
    }


    /**
     * 模板模式
     */
    public void templateMethod() {
        CarTemplate benz = new BenzCar();
        benz.buildCar();
        CarTemplate bmw = new BMWCar();
        bmw.buildCar();
    }


    /**
     * 简单工厂模式
     */
    public void simpleFactoryMethod() {
        try {
            Operation add = EasyFactory.createOperation("+");
            add.getResult(5, 3);
            Operation sub = EasyFactory.createOperation("-");
            sub.getResult(4, 1);
            Operation mul = EasyFactory.createOperation("*");
            mul.getResult(2, 3);
            Operation div = EasyFactory.createOperation("/");
            div.getResult(4, 8);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 工厂方法模式
     */

    public void factoryMethod(){
        Factory factory = new IDCardFactory();
        Product card_1 = factory.create("Jack");
        Product card_2 = factory.create("Mark");
        Product card_3 = factory.create("Tom");
        card_1.use();
        card_2.use();
        card_3.use();
    }
}
