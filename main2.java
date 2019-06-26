import java.io.FileNotFoundException;
import java.io.FileReader; 

public class main2 {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader fr=new FileReader("test.txt");  
        Lexico lexico = new Lexico();
        Sintatico sintatico = new Sintatico();
        Semantico semantico = new Semantico();
        
        lexico.setInput(fr);
        
        try {
            sintatico.parse(lexico, semantico);
        }catch (LexicalError e) {
            System.err.println("Erro léxico em: " + e.getPosition());
        }catch (SyntaticError e) {
            System.err.println("Erro sintático em: " + e.getPosition());
        }catch (SemanticError e) {
            //Trata erros semânticos
        }

    }
}