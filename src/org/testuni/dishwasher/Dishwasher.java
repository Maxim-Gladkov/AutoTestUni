package org.testuni.dishwasher;

import java.util.ArrayList;
import java.util.List;

public class Dishwasher {

    private int occupancy = 0;
    private List<Tableware> loadedTableware = new ArrayList<>();
    private Boolean engineWork;
    private int maxItems;


    public Dishwasher (int maxItems) {
        if (maxItems == 0) {
            throw new IllegalArgumentException("Max amount of items in dishwasher can not be null!");
        }
        this.maxItems = maxItems;
        this.engineWork = false;
    }

    /**
     * Метод загружает посуду в посудомоечную машину
     * @param item - экземпляр класса Items, который помещается в ArrayList "loadedTableware"
     * Полю "occupancy" присваивается значение, равное размеру ArrayList "loadedTableware"
     * @throws MyExceptions.OccupancyException если машина полностью заполнена
     * @throws MyExceptions.EngineStateExceptions если машина уже запущенна
     * @throws MyExceptions.TablwareStateException если посуда в машине чистая
     */
    public void setTableware (Tableware item) {
        this.loadedTableware.add(item);
        this.occupancy = loadedTableware.size();
        System.out.println("Amount of items in dishwasher: " + occupancy);

        if (occupancy == maxItems) {
            throw new MyExceptions.OccupancyException("Dishwasher has been already packed!");
        }
        if (engineWork != false) {
            throw new MyExceptions.EngineStateExceptions("Dishwasher is working right now!");
        }
        if (item.getClean() == true) {
            throw new MyExceptions.TablwareStateException("The items in dishwasher are clean!");
        }
    }

    /**
     * Метод позволяет достать посуду из посудомоечной машины
     * Очищаем ArrayList "loadedTableware" и присваем его размер полю "occupancy"
     * Выводит сообщение в консоль
     */
    public void removeTableware() {
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
    public void launchDishwasher() {
        this.occupancy = loadedTableware.size();

        if (occupancy == 0) {
            throw new MyExceptions.OccupancyException("Dishwasher is empty!");
        }
        if (engineWork == true) {
            throw new MyExceptions.EngineStateExceptions("Dishwasher is working right now!");
        }
        if (engineWork == false) {
            engineWork = true;
        }
        System.out.println("The dishwasher state is: " + engineWork);
    }

    /**
     * Метод останавливает работу посудомоечной машины
     * @throws MyExceptions.EngineStateExceptions если машина не запущенна
     * Выводит в консоль сообщение, что работа посудомоечной машины остановленна
     */
    public void stopDishwasher() {

        if (engineWork == false) {
            throw new MyExceptions.EngineStateExceptions("The dishwasher is not working!");
        }
        if (engineWork == true) {
            engineWork = false;
        }
        System.out.println("The dishwasher state is: " + engineWork);
    }


}
