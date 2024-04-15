import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) {
        try{

            String source = "Data.txt";
            CharStream cs = fromFileName(source);
            JobOpeningLexer lexer = new JobOpeningLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            JobOpeningParser parser = new JobOpeningParser(token);
            JobOpeningParser.JobOpeningContext tree = parser.jobOpening();
            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);
        } catch (IOException e) {
            e.printStackTrace();
        }


        ;
    }
}