import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * 
 */

/**
 * @author Minedient
 *
 */
public class fx50Program {

	public static void main(String[] args) {
		try {
			CharStream input = (CharStream) new ANTLRFileStream("test.fx50");
			fx50Lexer lexer = new fx50Lexer(input);
			fx50Parser parser = new fx50Parser(new CommonTokenStream(lexer));
			ParseTree tree = parser.program();
			fx50CustomVisitor visitor = new fx50CustomVisitor();
			
			JFrame frame = new JFrame("Antlr AST");
			JPanel panel = new JPanel();
			TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
			viewr.setScale(1.5);// scale a little
			panel.add(viewr);
			frame.add(panel);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(400, 400);
			frame.setVisible(true);
			Double ans = visitor.visit(tree);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
