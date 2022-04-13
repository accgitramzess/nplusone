package com.nplusone.immutable;


import java.util.ArrayList;
import java.util.List;

/*

 Immutable objects are those objects whose state can not be changed once created

    What are steps for creating an immutable class?

    Make your class final :
    If you make your class final, no class will be able to extend it, hence will not be able override methods of this class.

    Declare all instance variable with private and final :
    If you make instance variable private, no outside class will be able to access instance variables and if you make them final, you can not change it.

    Say no to setter methods :
    Don’t create setter method for any instance variables, hence there will be no explicit way to change state of instance variables.

    Initialize all variables in constructor :
    You can initialize variables in constructor. You need to take special care while working with mutable object. You need to do deep copy in case of immutable objects.

    Perform cloning of mutable objects while returning from getter method:
    If you return clone of object from getter method, it won’t return original object, so your original object will remain intact.
    Read : Why String is immutable in java


    String, Integer, Long, Double, Character, Boolean etc and much more. Date is not an immutable class.
 */
public final class EventBus {

    private final int eventId;

    private final int eventType;

    private final ArrayList<EventBusData> datas;

    public EventBus(int eventId, int eventType, ArrayList<EventBusData> datas) {
        this.eventId = eventId;
        this.eventType = eventType;
        // deep copy here
        // this.datas = datas;
        this.datas = (ArrayList<EventBusData>) datas.clone();
    }

    public int getEventId() {
        return eventId;
    }

    public int getEventType() {
        return eventType;
    }

    public List<EventBusData> getDatas() {
        // deep copy here also
        // return datas;

        return (List<EventBusData>) datas.clone();
    }

    public static void main(String[] args) {
        EventBusData eventBusData1 = new EventBusData("1");
        ArrayList<EventBusData> eventBusDataList = new ArrayList<>();
        eventBusDataList.add(eventBusData1);
        EventBus eventBus = new EventBus(1, 1, eventBusDataList);

        List<EventBusData> datas = eventBus.getDatas();
        datas.add(new EventBusData("2"));
        System.out.println(eventBus.getDatas().size());

        eventBusDataList.add(new EventBusData("3"));
        System.out.println(eventBus.getDatas().size());

        ((ArrayList<EventBusData>) eventBusDataList).clone();
    }
}
