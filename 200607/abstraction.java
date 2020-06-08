class abstraction {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.PrintName();
        dog.Growl();

        Poodles poodle = new Poodles();
        poodle.PrintName();
        poodle.Growl();
    }
}

abstract class Animals {
    abstract public void PrintName();
    abstract public void Growl();
}

class Dogs extends Animals {
    public void PrintName() {
        System.out.println("개");
    }

    public void Growl() {
        System.out.println("멍멍");
    }
}

class Poodles extends Dogs {
    public void PrintName() {
        System.out.println("푸들");
    }
}