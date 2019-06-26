import java.io.FileNotFoundException;
import java.io.FileReader; 

public class main {

    public static void main(String[] args) throws FileNotFoundException {
        Lexico lexico = new Lexico();
        FileReader fr=new FileReader("test.txt");  
        lexico.setInput(fr);
        
        try {
            Token t = null;
            while ( (t = lexico.nextToken()) != null ) {
                System.out.println(t.getLexeme());
            }
        }catch(LexicalError e) {
            System.err.println(e.getMessage() + ";, em " + e.getPosition());
        }
    }
}