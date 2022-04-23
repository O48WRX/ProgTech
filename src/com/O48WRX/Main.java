package com.O48WRX;

import com.O48WRX.Beer.Singleton.Beer;
import com.O48WRX.Birds.ProgramToAnInterface.*;
import com.O48WRX.Car.ObjectComposition.Car;
import com.O48WRX.Car.ObjectComposition.CivilianCar;
import com.O48WRX.Car.ObjectComposition.RaceCar;
import com.O48WRX.Dragon.StrategyPattern.Dragon;
import com.O48WRX.Dragon.StrategyPattern.FireDragon;
import com.O48WRX.Juice.Observer.JuiceData;
import com.O48WRX.Juice.Observer.JuiceMachineDisplay;
import com.O48WRX.MonsterMasodikFeladat.Ogre;
import com.O48WRX.Notification.Factory.Notification;
import com.O48WRX.Notification.Factory.NotificationFactory;
import com.O48WRX.Person.BuilderPattern.Person;
import com.O48WRX.SasElsoFeladat.Sas;
import com.O48WRX.Tree.Prototype.PineTree;
import com.O48WRX.Tree.Prototype.PlasticTree;
import com.O48WRX.Tree.Prototype.TreePrototype;
import com.sun.source.tree.Tree;

public class Main {

    public static void main(String[] args) {
        System.out.println("===============O48WRX===============");
        System.out.println(" Programozasi Technologiak beadando ");
        System.out.println("====================================");
        System.out.println("Feladat: Sajat Java osztaly 3 privat tagvaltozo...");
        Sas sas = new Sas(1,20,6);
        System.out.println(sas);
        System.out.println("====================================");
        System.out.println("Feladat: Java interface 3 db tagfuggveny, 1 osztaly...");
        Ogre ogre = new Ogre((byte)100,(byte)20,(byte)10);
        ogre.dealDamage();
        ogre.receiveDamage((byte)20);
        ogre.block();
        System.out.println("====================================");
        System.out.println("Feladat: Keszitsen peldat Programozz feluletre implementacio helyett...");
        Bird bird1 = new Hummingbird();
        Bird bird2 = new Raven();
        Bird bird3 = new Robin();
        Bird bird4 = new Owl();

        bird1.performSound();
        bird2.performSound();
        bird3.performSound();
        bird4.performSound();
        System.out.println("====================================");
        System.out.println("Feladat: Keszitsen peldat Hasznalj objektum-osszetetelt orokles helyett...");
        Car car1 = new CivilianCar();
        Car car2 = new RaceCar();

        car1.performDrive();
        car2.performDrive();

        car1.performEngineTurnedOn();
        car2.performEngineTurnedOn();

        car1.Move();
        car2.Move();

        car1.Park();
        car2.Park();

        car1.performEngineTurnedOff();
        car2.performEngineTurnedOff();

        car1.performLeaveWheel();
        car2.performLeaveWheel();
        System.out.println("====================================");
        System.out.println("Feladat: Strategia (Strategy) tervezesi minta pelda");
        Dragon dragon1 = new FireDragon("Numinex");
        dragon1.Fly();
        dragon1.BreatheMagic();
        System.out.println("====================================");
        System.out.println("Feladat: Prototipus (Prototype) tervezesi minta pelda");
        TreePrototype pinetree1 = new PineTree(1,true,50);
        TreePrototype pinetree2 = pinetree1.clone();

        pinetree1.grow();
        pinetree2.grow();

        TreePrototype plastictree1 = new PlasticTree(20,2,false);
        TreePrototype plastictree2 = plastictree1.clone();

        plastictree1.grow();
        plastictree2.grow();

        System.out.println("====================================");
        System.out.println("Feladat: Egyke(Singleton) tervezesi minta");

        Beer beer1 = Beer.getInstance();
        Beer beer2 = Beer.getInstance();

        if(beer1.equals(beer2))
            System.out.println("beer1 equals beer2");

        System.out.println("====================================");
        System.out.println("Feladat: Megfigyelo(Observer) tervezesi minta");

        JuiceData juiceDataSubject = new JuiceData();

        JuiceMachineDisplay juiceMachineDisplay = new JuiceMachineDisplay(juiceDataSubject);

        juiceDataSubject.setNumberOfJuiceSold(1);
        juiceDataSubject.setNumberOfJuiceSold(2);
        juiceDataSubject.setNumberOfJuiceSold(3);
        juiceDataSubject.setNumberOfJuiceSold(4);

        juiceDataSubject.removeObserver(juiceMachineDisplay);

        System.out.println("====================================");
        System.out.println("Feladat: Epito(Builder) tervezesi minta");

        Person person = new Person.Builder("Zsolt","Kardos","kardos.zsolt@valami.com")
                .age(21)
                .height(172)
                .weight(72)
                .build();
        System.out.println(person.toString());

        person = new Person.Builder("Jeff","Bezos","jeffbezos@somewhere.com").build();
        System.out.println(person.toString());

        System.out.println("====================================");
        System.out.println("Feladat: Gyartometodus(Factory method) tervezesi minta");

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
