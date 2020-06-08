class use_array {
    public static void main(String[] args) {
        int [] array = new int[5];

        for(int i=1;i<=5;i++) {
            array[i-1] = ((i-1) * 2) + 1;
        }
        for(int i=0;i<5;i++) {
            System.out.println(array[i]);
        }
    }
}