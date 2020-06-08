import java.util.Scanner;

class Word {
    private String eng;
    private String mean;

    public Word(String eng, String mean) {
        this.eng = eng;
        this.mean = mean;
    }

    public String getEng() { return this.eng; }
    public String getMean() { return this.mean; }

    public String toString() { return this.eng + " : " + this.mean; }
}

class word_test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String eng, mean;

        int NUM = 2;
        Word [] input = new Word[NUM];

        for(int i=0;i<NUM;i++) {
            System.out.print((i+1) + " : 영단어와 뜻을 입력하세요 >>>>> ");
            eng = scan.next();
            mean = scan.next();
            input[i] = new Word(eng, mean);
        }

        loop :
        while(true) {
            String find;

            System.out.print("찾고자 하는 단어를 입력하세요. 종료(f) >> ");
            find = scan.next();

            if(find.equals("f")) {
                System.out.println("프로그램 종료");
                scan.close();
                return;
            }

            for(int i=0;i<NUM;i++) {
                if((input[i].getEng()).equals(find)) {
                    System.out.println(input[i].toString());
                    continue loop;
                }
            }
            System.out.println("해당 단어가 없습니다.");
        }   
    }
}