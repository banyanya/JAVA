class array_and_loop {
    public static void main(String[] args) {
        int [] array_odd = new int[5]; // 홀수배열
        int [] array_even = new int[5]; // 짝수배열
        int odd = 0, even = 0;

        for(int i=0;i<10;i++) {
            if((i+1)%2 == 0) {
                array_even[even] = i+1;
                even++;
            }
            else {
                array_odd[odd] = i+1;
                odd++;
            }
        }
        for(int i=0;i<5;i++) {
            System.out.println(array_odd[i]);
        }
        for(int i=0;i<5;i++) {
            System.out.println(array_even[i]);
        }
    }
}