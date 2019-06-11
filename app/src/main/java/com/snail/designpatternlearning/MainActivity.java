package com.snail.designpatternlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.snail.designpatternlearning.AbstractBuilderMethod.MobilePhone;
import com.snail.designpatternlearning.AdapterMethod.Adapter;
import com.snail.designpatternlearning.AdapterMethod.TypeC;
import com.snail.designpatternlearning.AdapterMethod.TypeCAdapter;
import com.snail.designpatternlearning.AdapterMethod.Usb;
import com.snail.designpatternlearning.BridgeMethod.AbstractMessage;
import com.snail.designpatternlearning.BridgeMethod.CommonMessage;
import com.snail.designpatternlearning.BridgeMethod.Message;
import com.snail.designpatternlearning.BridgeMethod.MessageEmail;
import com.snail.designpatternlearning.BridgeMethod.MessageImpl;
import com.snail.designpatternlearning.BridgeMethod.MessageSMS;
import com.snail.designpatternlearning.BridgeMethod.UrgencyMessage;
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
import com.snail.designpatternlearning.PrototypeMethod.ElectronicsProduct;
import com.snail.designpatternlearning.PrototypeMethod.IPadLine;
import com.snail.designpatternlearning.PrototypeMethod.IPhoneLine;
import com.snail.designpatternlearning.PrototypeMethod.Manager;
import com.snail.designpatternlearning.SimpleFactoryMethod.EasyFactory;
import com.snail.designpatternlearning.SimpleFactoryMethod.Operation;
import com.snail.designpatternlearning.SingleInstanceMethod.Book;
import com.snail.designpatternlearning.SingleInstanceMethod.Car;
import com.snail.designpatternlearning.StrategyMethod.IStrategy;
import com.snail.designpatternlearning.StrategyMethod.OldCustomerQuoteStrategy;
import com.snail.designpatternlearning.StrategyMethod.QuoteContext;
import com.snail.designpatternlearning.StrategyMethod.VIPCustomerQuoteStrategy;
import com.snail.designpatternlearning.TemplateMethod.BMWCar;
import com.snail.designpatternlearning.TemplateMethod.BenzCar;
import com.snail.designpatternlearning.TemplateMethod.CarTemplate;

import java.math.BigDecimal;

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
        prototypeMethod();
        bridgeMethod();
        strategyMethod();
    }


    /**
     * 建造者模式
     */
    public void builderMothod() {
        Director director = new Director(new AppleComputerBuilder());
        Computer computer = director.construct();
        Log.d(TAG, "builderMothod: cpu = " + computer.getCPU() +
                ",graphics = " + computer.getGraphics() +
                ",mainBoard = " + computer.getMainBoard() +
                ",disPlay = " + computer.getDisPlay());

        Director director1 = new Director(new SurfaceComputerBuilder());
        Computer computer1 = director.construct();
        Log.d(TAG, "builderMothod: cpu = " + computer.getCPU() +
                ",graphics = " + computer.getGraphics() +
                ",mainBoard = " + computer.getMainBoard() +
                ",disPlay = " + computer.getDisPlay());
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

    public void factoryMethod() {
        Factory factory = new IDCardFactory();
        Product card_1 = factory.create("Jack");
        Product card_2 = factory.create("Mark");
        Product card_3 = factory.create("Tom");
        card_1.use();
        card_2.use();
        card_3.use();
    }

    /**
     * 原型模式
     */
    public void prototypeMethod() {
        Manager manager = new Manager();
        IPadLine iPadLine = new IPadLine();
        IPhoneLine iPhoneLine = new IPhoneLine();
        manager.register("iPad", iPadLine);
        manager.register("iPhone", iPhoneLine);
        ElectronicsProduct iPad = manager.create("iPad");
        iPad.makeProduct("iPad");
        ElectronicsProduct iPhone = manager.create("iPhone");
        iPhone.makeProduct("iPhone");
    }

    /**
     * 桥梁模式
     */
    public void bridgeMethod() {
        MessageImpl message = new MessageSMS();
        AbstractMessage abstractMessage = new CommonMessage(message);
        abstractMessage.sendMessage(new Message("Jack Ma", "马总晚上7点开会"));

        message = new MessageEmail();
        abstractMessage = new UrgencyMessage(message);
        abstractMessage.sendMessage(new Message("Pony Ma", "明天晚上七点收购英雄联盟游戏会议"));
    }

    /**
     * 策略模式
     */
    public void strategyMethod() {
        IStrategy oldPriceStrategy = new OldCustomerQuoteStrategy();
        QuoteContext quoteContext = new QuoteContext(oldPriceStrategy);
        BigDecimal newPrice = quoteContext.getPrice(new BigDecimal(100));
        Log.d(TAG, "strategyMethod: oldCustomer's price is " + newPrice);

        oldPriceStrategy = new VIPCustomerQuoteStrategy();
        quoteContext = new QuoteContext(oldPriceStrategy);
        newPrice = quoteContext.getPrice(new BigDecimal(100));
        Log.d(TAG, "strategyMethod: VIPCustomer's price is " + newPrice);
    }
}
