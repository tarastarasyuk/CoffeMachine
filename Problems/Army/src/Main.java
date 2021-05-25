class Army {

    public static void createArmy() {
        Unit alex = new Unit("Alex");
        Unit taras = new Unit("Taras");
        Unit kate = new Unit("Kate");
        Unit julia = new Unit("Julia");
        Unit mark = new Unit("Mark");

        Knight edward = new Knight("Knight Edward");
        Knight kihot = new Knight("Knight Kihot");
        Knight ulrix = new Knight("Knight Ulrix");

        General phlillip = new General("General Phillip");

        Doctor watson = new Doctor("Doctor Watson");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }


    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}