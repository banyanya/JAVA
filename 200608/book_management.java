import java.util.Scanner;

class book_management {
    private final int MAX_BOOK = 10; // 등록 가능한 책의 최대 권수
    Book [] BookList = new Book[MAX_BOOK];
    int iBookLength = 0; // 현재 책의 권수
    
    public static void main(String [] args) {
        System.out.println("=====Library Program Start=====");
        book_management libraryProg = new book_management();
        libraryProg.Run();
    }

    // run
    public void Run() {
        while (true) {
            int input = -1;
            Scanner scan = new Scanner(System.in);

            System.out.println("-----------------------");
            System.out.println("1. new Book");
            System.out.println("2. delete Book");
            System.out.println("3. search Book");
            System.out.println("4. print Book");
            System.out.println("0. Quit");
            System.out.print("Input : ");
            
            // 예외 처리
            try {
                input = Integer.valueOf(scan.next());
            } catch(Exception e) {
                System.out.println("ERROR!");
                continue;
            }

            // 메뉴 선택
            switch(input) {
                case 1 :
                    NewBook();
                    System.out.println("");
                    break;
                case 2 :
                    DeleteBook();
                    System.out.println("");
                    break;
                case 3 :
                    SearchBook();
                    System.out.println("");
                    break;
                case 4 :
                    PrintBook();
                    System.out.println("");
                    break;
                case 0 :
                    System.out.println("Bye");
                    return;
                default :
                    System.out.println("[ERROR] Invalid Input");
                    System.out.println("");
                    break;
            }
        }    
    }

    // new book list
    public void NewBook() {
        // 최대 등록 권수를 초과하였을 경우
        if(iBookLength > MAX_BOOK) {
            System.out.println("책장이 부족합니다.");
            return;
        }

        Scanner scan = new Scanner(System.in);
        String name, author;
        int page, genre;

        System.out.print("책 제목 : ");
        name = scan.next();
        System.out.print("저자 : ");
        author = scan.next();
        System.out.print("페이지수 : ");
        page = Integer.valueOf(scan.next());

        System.out.print("책의 장르를 선택해주세요(1. 코믹  2. 호러  3. 로맨스) : ");
        genre = Integer.valueOf(scan.next());

        switch(genre) {
            case 1 :
                BookList[iBookLength] = new Comic(name, author, page);
                iBookLength++;
                break;
            case 2 :
                BookList[iBookLength] = new Horror(name, author, page);
                iBookLength++;
                break;
            case 3 :
                BookList[iBookLength] = new Romance(name, author, page);
                iBookLength++;
                break;
            default :
                System.out.println("잘못 선택하셨습니다.");
                break;
        }
    }

    // delete book
    public void DeleteBook() {
        // 등록된 책이 없을 경우
        if(iBookLength == 0) {
            System.out.println("책장에 책이 없습니다.");
            return;
        }

        Scanner scan = new Scanner(System.in);
        String input;

        System.out.print("삭제할 책의 제목을 입력하세요 : ");
        input = scan.next();

        for(int i=0;i<iBookLength;i++) {
            if(input.equals(BookList[i].getName())) {
                for(int j=i+1;j<iBookLength;j++) {
                    BookList[j-1] = BookList[j];
                }
                iBookLength--;
                return;
            }
        }
        System.out.println("해당 책이 존재하지 않습니다.");
    }

    // search book
    public void SearchBook() {
        // 등록된 책이 없을 경우
        if(iBookLength == 0) {
            System.out.println("책장에 책이 없습니다.");
            return;
        }

        Scanner scan = new Scanner(System.in);
        String input;

        System.out.print("찾을 책의 제목을 입력하세요 : ");
        input = scan.next();

        for(int i=0;i<iBookLength;i++) {
            if(input.equals(BookList[i].getName())) {
                System.out.println("해당 책이 존재합니다.");
                System.out.println("제목 : " + BookList[i].getName());
                System.out.println("저자 : " + BookList[i].getAuthor());
                System.out.println("페이지수 : " + BookList[i].getPage());
                System.out.println("장르 : " + BookList[i].getGenre());
                return;
            }
        }
        System.out.println("해당 책이 존재하지 않습니다.");
    }

    // print book list
    public void PrintBook() {
        // 등록된 책이 없을 경우
        if(iBookLength == 0) {
            System.out.println("책장에 책이 없습니다.");
            return;
        }
        
        System.out.println("총 서적 권수 : " + iBookLength);
        for(int i=0;i<iBookLength;i++) {
            System.out.println((i+1) + ". [" + BookList[i].getGenre() + "] " + BookList[i].getName() + "(" + BookList[i].getAuthor() + ", " + BookList[i].getPage() + "p)");
        }
    }
}



abstract class Book {
    protected String name;
    protected String author;
    protected int page;
    protected String genre;

    public Book(String name, String author, int page) {
        this.name = name;
        this.author = author;
        this.page = page;
        setGenre();
    }

    public String getName() { return this.name; }
    public String getAuthor() { return this.author; }
    public int getPage() { return this.page; }
    
    abstract void setGenre();
    public String getGenre() { return this.genre; }
}


class Comic extends Book {
    public Comic(String name, String author, int page) {
        super(name, author, page);
    }

    @Override
    void setGenre() {
        this.genre = "코믹";
    }
}
class Horror extends Book {
    public Horror(String name, String author, int page) {
        super(name, author, page);
    }

    @Override
    void setGenre() {
        this.genre = "호러";
    }
}
class Romance extends Book {
    public Romance(String name, String author, int page) {
        super(name, author, page);
    }

    @Override
    void setGenre() {
        this.genre = "로맨스";
    }
}