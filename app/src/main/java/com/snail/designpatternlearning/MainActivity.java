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
import com.snail.designpatternlearning.ChainOfResponsibilityMethod.FightHandler;
import com.snail.designpatternlearning.ChainOfResponsibilityMethod.HeadmanFightHandler;
import com.snail.designpatternlearning.ChainOfResponsibilityMethod.MasterFightHandler;
import com.snail.designpatternlearning.ChainOfResponsibilityMethod.Protagonist;
import com.snail.designpatternlearning.ChainOfResponsibilityMethod.SelfFightHandler;
import com.snail.designpatternlearning.ChainOfResponsibilityMethod.TogetherFightHandler;
import com.snail.designpatternlearning.CompositeMethod.Directory;
import com.snail.designpatternlearning.CompositeMethod.Entry;
import com.snail.designpatternlearning.CompositeMethod.File;
import com.snail.designpatternlearning.DecoratorMethod.Bubble;
import com.snail.designpatternlearning.DecoratorMethod.CaremeMilkTea;
import com.snail.designpatternlearning.DecoratorMethod.MilkTea;
import com.snail.designpatternlearning.DecoratorMethod.Pudding;
import com.snail.designpatternlearning.FacadeMethod.Benz;
import com.snail.designpatternlearning.FacadeMethod.CarFrame;
import com.snail.designpatternlearning.FacadeMethod.Giti;
import com.snail.designpatternlearning.FacadeMethod.Michelin;
import com.snail.designpatternlearning.FactoryMethod.Factory;
import com.snail.designpatternlearning.FactoryMethod.IDCardFactory;
import com.snail.designpatternlearning.FactoryMethod.Product;
import com.snail.designpatternlearning.FlyweightMethod.Flyweight;
import com.snail.designpatternlearning.FlyweightMethod.FlyweightFactory;
import com.snail.designpatternlearning.IteratorMethod.Iterator;
import com.snail.designpatternlearning.IteratorMethod.Phone;
import com.snail.designpatternlearning.IteratorMethod.PhoneCollection;
import com.snail.designpatternlearning.MediatorMethod.BathDevice;
import com.snail.designpatternlearning.MediatorMethod.CurtainDevice;
import com.snail.designpatternlearning.MediatorMethod.CustomerMediator;
import com.snail.designpatternlearning.MediatorMethod.MusicDevice;
import com.snail.designpatternlearning.MediatorMethod.SmartDevice;
import com.snail.designpatternlearning.MediatorMethod.SmartMediator;
import com.snail.designpatternlearning.MementoMethod.Caretaker;
import com.snail.designpatternlearning.MementoMethod.Originator;
import com.snail.designpatternlearning.ObserverMethod.ConcreteObserver;
import com.snail.designpatternlearning.ObserverMethod.ConcreteSubject;
import com.snail.designpatternlearning.ObserverMethod.Observer;
import com.snail.designpatternlearning.ObserverMethod.Subject;
import com.snail.designpatternlearning.PrototypeMethod.ElectronicsProduct;
import com.snail.designpatternlearning.PrototypeMethod.IPadLine;
import com.snail.designpatternlearning.PrototypeMethod.IPhoneLine;
import com.snail.designpatternlearning.PrototypeMethod.Manager;
import com.snail.designpatternlearning.ProxyMethod.DynamicProxy;
import com.snail.designpatternlearning.ProxyMethod.ISubject;
import com.snail.designpatternlearning.ProxyMethod.RealSubject;
import com.snail.designpatternlearning.ProxyMethod.StaticProxy;
import com.snail.designpatternlearning.SimpleFactoryMethod.EasyFactory;
import com.snail.designpatternlearning.SimpleFactoryMethod.Operation;
import com.snail.designpatternlearning.SingleInstanceMethod.Book;
import com.snail.designpatternlearning.SingleInstanceMethod.Car;
import com.snail.designpatternlearning.StateMethod.DayState;
import com.snail.designpatternlearning.StateMethod.SafeHome;
import com.snail.designpatternlearning.StateMethod.State;
import com.snail.designpatternlearning.StrategyMethod.IStrategy;
import com.snail.designpatternlearning.StrategyMethod.OldCustomerQuoteStrategy;
import com.snail.designpatternlearning.StrategyMethod.QuoteContext;
import com.snail.designpatternlearning.StrategyMethod.VIPCustomerQuoteStrategy;
import com.snail.designpatternlearning.TemplateMethod.BMWCar;
import com.snail.designpatternlearning.TemplateMethod.BenzCar;
import com.snail.designpatternlearning.TemplateMethod.CarTemplate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.util.Calendar;

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
        compositeMethod();
        decoratorMethod();
        chainOfResponbility();
        faradeMethod();
        mediatorMethod();
        observerMethod();
        mementoMethod();
        stateMethod();
        flyweightMethod();
        staticProxyMethod();
        dynamicProxyMethod();
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
        Computer computer1 = director1.construct();
        Log.d(TAG, "builderMothod: cpu = " + computer1.getCPU() +
                ",graphics = " + computer1.getGraphics() +
                ",mainBoard = " + computer1.getMainBoard() +
                ",disPlay = " + computer1.getDisPlay());
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

    /**
     * 组合模式
     */
    public void compositeMethod() {
        Entry rootDir = new Directory("root");
        Entry binDir = new Directory("bin");
        Entry tmpDir = new Directory("tmp");
        Entry usrDir = new Directory("usr");
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        binDir.add(new File("wechat", 50));
        usrDir.add(new File("qq", 100));
        rootDir.printList();
    }

    /**
     * 装饰器模式
     */
    public void decoratorMethod() {
        MilkTea milkTea = new CaremeMilkTea();
        Log.d(TAG, "decoratorMethod: milkTea is " + milkTea.getMaterial() + ", the price is " + milkTea.getTotalPrice());
        milkTea = new Pudding(milkTea);
        Log.d(TAG, "decoratorMethod: milkTea is " + milkTea.getMaterial() + ", the price is " + milkTea.getTotalPrice());
        milkTea = new Bubble(milkTea);
        Log.d(TAG, "decoratorMethod: milkTea is " + milkTea.getMaterial() + ", the price is " + milkTea.getTotalPrice());
    }

    /**
     * 责任链模式
     */
    public void chainOfResponbility() {
        FightHandler selfHandler = new SelfFightHandler();
        FightHandler masterHandler = new MasterFightHandler();
        FightHandler headmenHandler = new HeadmanFightHandler();
        FightHandler togetherHandler = new TogetherFightHandler();

        selfHandler.setSuccessor(masterHandler);
        masterHandler.setSuccessor(headmenHandler);
        headmenHandler.setSuccessor(togetherHandler);

        Protagonist songqingshu = new Protagonist("宋青书", 18, 88);
        selfHandler.fightWith(songqingshu);

        Protagonist songyuanqiao = new Protagonist("宋远桥", 37, 180);
        selfHandler.fightWith(songyuanqiao);

        Protagonist zhangsanfeng = new Protagonist("张三丰", 90, 280);
        selfHandler.fightWith(zhangsanfeng);
    }


    /**
     * 外观模式
     */
    public void faradeMethod() {
        CarFrame carFrame = new CarFrame(new Benz(), new Giti());
        carFrame.drive();
        carFrame.setTyre(new Michelin());
        carFrame.drive();
    }


    /**
     * 中介者模式
     */
    public void mediatorMethod() {
        SmartDevice bd = new BathDevice();
        SmartDevice cd = new CurtainDevice();
        SmartDevice md = new MusicDevice();
        SmartMediator sm = new CustomerMediator(bd, cd, md);
        cd.operateDevice("open", sm);
        md.operateDevice("close", sm);
    }


    /**
     * 观察者模式
     */
    public void observerMethod() {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.attach(observer);
        ((ConcreteSubject) subject).change("yellow");

    }

    /**
     * 备忘录模式
     */
    public void mementoMethod() {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.resetMemento(caretaker.getMemento());
    }

    /**
     * 状态模式
     */
    public void stateMethod() {
        SafeHome safeHome = new SafeHome();
        safeHome.setLock(Calendar.HOUR_OF_DAY);
        safeHome.recordLog("使用库房");
    }

    /**
     * 共享模式（享元模式）
     */
    public void flyweightMethod() {
        FlyweightFactory.getFlyweight("Car");
    }


    /**
     * 静态代理
     */
    public void staticProxyMethod() {
        StaticProxy proxy = new StaticProxy();
        proxy.request();
    }

    /**
     * 动态代理
     */
    public void dynamicProxyMethod() {
        ISubject proxySubject = DynamicProxy.getProxySubject();
        proxySubject.request();
    }
}
