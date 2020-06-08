// 오버라이딩 : 부모 클래스에서 상속된 내용을
//            자식 클래스에서 재정의하는 것

class overriding {
    public static void main(String[] args) {
        Soccer soccer = new Soccer();
        Tennis tennis = new Tennis();

        soccer.setSportsName();
        tennis.setSportsName();

        soccer.printSportsName();
        tennis.printSportsName();
    }
}

class Sports {
    protected String SportsName;

    public void setSportsName() {
        SportsName = "Sports";
    }
    
    public void printSportsName() {
        System.out.println(SportsName);
    }
}

class Soccer extends Sports {
    public void setSportsName() {
        SportsName = "Soccer";
    }
}

class Tennis extends Sports {
    public void setSportsName() {
        SportsName = "Tennis";
    }
}