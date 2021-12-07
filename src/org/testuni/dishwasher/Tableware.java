package org.testuni.dishwasher;

import java.util.ArrayList;

public  class Tableware {

        private String state;
        private String type;

    /**
     * Конструктор для столовой посуды
     * @param state
     * @param type
     */
        public Tableware(String state, String type) {
                this.state = state;
                this.type = type;
    }

    /**
     * Метод возвращает состояние посуды - clean/dirty
     * @return значение поля "state"
     */
    public String getState() {
            return state;
    }

    /**
     * Метод возвращает тип посуды
     * @return значение поля "type"
     */
    public String getType() {
            return type;
    }


}
