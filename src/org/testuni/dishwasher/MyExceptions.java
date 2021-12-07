package org.testuni.dishwasher;

public class MyExceptions {

    public static class OccupancyException extends RuntimeException  {
        public OccupancyException (String message) {
            super(message);
        }
    }

    public static class EngineStateExceptions extends RuntimeException {
        public EngineStateExceptions (String message) {
            super(message);
        }
    }

    public static class TablwareStateException extends RuntimeException {
        public TablwareStateException (String message) {
            super(message);
        }
    }

}
