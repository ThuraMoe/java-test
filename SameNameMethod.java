// Method Overloading
public class SameNameMethod {
    public static void main(String[] args) {
        Paper p = new Paper();
        NoteBook n = new NoteBook();

        takeNote("Java Learning ~ 4hr", p);
        System.out.println(p.message);

        takeNote("Angular Learning ~ 4hr", n);
        System.out.println(n.message);

    }

    static void takeNote(String m, Paper paper) {
        paper.message = m;
    }

    static void takeNote(String m, NoteBook noteBook) {
        noteBook.message = m;
    }
}

class Paper {
    String message;
}

class NoteBook {
    String message;
}
