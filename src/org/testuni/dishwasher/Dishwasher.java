package org.testuni.dishwasher;

import java.util.ArrayList;

public class Dishwasher {

    private int occupancy = 0;
    private ArrayList<Items> loadedTableware = new ArrayList<>();
    private String engineState;
    private int maxItems;


    /**
     * Конструктор для экземпляров класса Dishwasher
     * @param maxItems - является константой
     * Полю "engineState" по-умолчанию присваивается значение "stop"
     * @throws NullPointerException если поле maxItems == 0
     */
    public Dishwasher (int maxItems) {
        this.maxItems = maxItems;
        this.engineState = "stop";

        if (maxItems == 0) {
            throw new NullPointerException("Max amount of items in dishwasher can not be null!");
        }
    }

    /**
     * Метод загружает посуду в посудомоечную машину
     * @param item - экземпляр класса Items, который помещается в ArrayList "loadedTableware"
     * Полю "occupancy" присваивается значение, равное размеру ArrayList "loadedTableware"
     * @throws MyExceptions.OccupancyException если машина полностью заполнена
     * @throws MyExceptions.EngineStateExceptions если машина уже запущенна
     * @throws MyExceptions.TablwareStateException если посуда в машине чистая
     */
    public void setTableware (Items item) {
        this.loadedTableware.add(item);
        this.occupancy = loadedTableware.size();
        System.out.println("Amount of items in dishwasher: " + occupancy);

        if (occupancy == maxItems) {
            throw new MyExceptions.OccupancyException("Dishwasher has been already packed!");
        }else if (engineState != "stop") {
            throw new MyExceptions.EngineStateExceptions("Dishwasher is working right now!");
        }else if (item.getState() == "clean") {
            throw new MyExceptions.TablwareStateException("The items in dishwasher are clean!");
        }
    }

    /**
     * Метод позволяет достать посуду из посудомоечной машины
     * Очищаем ArrayList "loadedTableware" и присваем его размер полю "occupancy"
     * Выводит сообщение в консоль
     */
    protected void removeTableware() {
        this.loadedTableware.clear();
        this.occupancy = loadedTableware.size();
        System.out.println("Dishwasher is empty: " + occupancy);
    }

    /**
     * Метод запускает посудомоечную машину
     * Присваиваем полю "occupancy" размер ArrayList "loadedTableware"
     * @throws MyExceptions.OccupancyException если машина пустая
     * @throws MyExceptions.EngineStateExceptions если машина уже запущенна
     * Выводим в консоль сообщение, что посудомоечная машина работает
     */
    protected void launchDishwasher() {
        this.occupancy = loadedTableware.size();

        if (occupancy == 0) {
            throw new MyExceptions.OccupancyException("Dishwasher is empty!");
        }else if (engineState == "start") {
            throw new MyExceptions.EngineStateExceptions("Dishwasher is working right now!");
        }else if (engineState == "stop") {
            engineState = "start";
        }
        System.out.println("The dishwasher state is: " + engineState);
    }

    /**
     * Метод останавливает работу посудомоечной машины
     * @throws MyExceptions.EngineStateExceptions если машина не запущенна
     * Выводит в консоль сообщение, что работа посудомоечной машины остановленна
     */
    protected void stopDishwasher() {

        if (engineState == "stop") {
            throw new MyExceptions.EngineStateExceptions("The dishwasher is not working!");
        }else if (engineState == "start") {
            engineState = "stop";
        }
        System.out.println("The dishwasher state is: " + engineState);
    }


}
