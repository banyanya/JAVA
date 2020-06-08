import java.util.Scanner;

// 단어 클래스
class wordClass {
    private String word; // 단어
    private String mean; // 뜻

    public wordClass(String word, String mean) {
        this.word = word;
        this.mean = mean;
    }

    public String getWord() {return this.word;}
    public void setWord(String word) {this.word = word;}
    public String getMean() {return this.mean;}
    public void setMean(String mean) {this.mean = mean;}
    
    public String toString() {return this.word + " : " + this.mean;}
}

// START
public class word {
    public static void main(String[] args) {
        wordClass[] input = new wordClass[5];        
        
        String word, mean; // 단어, 뜻
        Scanner scan = new Scanner(System.in);

        for(int i=0;i<input.length;i++) {
            System.out.print((i+1) + " : 영단어와 뜻을 입력하세요 >>>>> ");
            word = scan.next();
            mean = scan.next();
            input[i] = new wordClass(word, mean);
        }

        loop:
        while(true) {
            String find;
            
            System.out.println("찾고자 하는 단어를 입력하세요. 종료(f) >> ");
            find = scan.next();
            
            if (find.equals("f")) {
                System.out.println("프로그램 종료");
                return;
            }
            for(int i=0;i<input.length;i++) {
                if(find.equals(input[i].getWord())) {
                    System.out.println(input[i].toString());
                    continue loop;
                }
            }
            System.out.println("해당 단어가 없습니다");
        }
    }
}