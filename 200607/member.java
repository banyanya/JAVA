class member {
    public static void main(String[] args) {
        Calculate c = new Calculate();

        System.out.println(c.Add(3, 12));
        System.out.println(c.Sub(0, 4));
        System.out.println(c.Times(3, 4));
        System.out.println(c.Divide(3,2));
    }
}

class Calculate {
    double Add(double a, double b) {
        return a + b;
    }
    double Sub(double a, double b) {
        return a - b;
    }
    double Times(double a, double b) {
        return a * b;
    }
    double Divide(double a, double b) {
        return a / b;
    }

    // void print() {
    //     System.out.println(result);
    // }
}