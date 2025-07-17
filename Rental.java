public class Rental {
    public static class Contract {
        private String name;
        private int days;
        private int kilo;

        public Contract(String name, int days, int kilo){
            this.name = name;
            this.days = days;
            this.kilo = kilo;
        }
        
    }

    public static class Vehicle{
        protected String id;
        protected Contract contract;

        public Vehicle(String id, String name, int days, int kilo){
            this(id,new Contract(name, days, kilo));
        }

        public Vehicle(String id, Contract contract){
            this.id = id;
            this.contract = contract;
        }
    }

    public static class Car extends Vehicle{
        private int seats;
        public Car(int seats, String id, String name, int days, int kilo){
            super(id, name, days, kilo);
            this.seats = seats;
        }
    }

    public static class Truck extends Vehicle{
        private int max;
    }

    public static class Motorcycle extends Vehicle{
        private boolean offRoad;
    }
}
