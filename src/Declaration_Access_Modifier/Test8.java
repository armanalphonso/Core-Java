 package Declaration_Access_Modifier;

class Vehicle {
    public int getNoofwheels() {
        return 4;  // Default value for the base class
    }
}

class Auto extends Vehicle {
    @Override
    public int getNoofwheels() {
        return 3;  // Overridden value
    }
}

class Test8 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println("Vehicle wheels: " + v.getNoofwheels());

        Auto a = new Auto();
        System.out.println("Auto wheels: " + a.getNoofwheels());
    }
}
