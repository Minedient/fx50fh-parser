import java.util.HashMap;
import java.util.Map;


/**
 * 
 */

/**
 * This is the logic implement visitor class.
 * 
 * @author Minedient
 *
 */
public class fx50CustomVisitor extends fx50BaseVisitor<Double> {

	public Map<String, Double> vars = new HashMap<String, Double>(){{
		put("A", 0.0);
		put("B", 0.0);
		put("C", 0.0);
		put("D", 0.0);
		put("X", 0.0);
		put("Y", 0.0);
		put("M", 0.0);
		put("Ans", 0.0);
		put("pi", Math.PI);
		put("e", Math.E);
	}};
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see fx50BaseVisitor#visitLet(fx50Parser.LetContext)
	 */
	@Override
	public Double visitLet(fx50Parser.LetContext ctx) {
		
		Double val;
		if(ctx.expr()!=null)
			val= visit(ctx.expr());	//visit the tree to get the answer
		else if(ctx.logicExpr()!=null)
			val = visit(ctx.logicExpr());
		else
			val = visit(ctx.logicExprFunc());
		vars.put(ctx.VAR().getText(), val);
		/*
		 * Keep my stupid code for remind
		 * 
		if(ctx.expr().getStart().getTokenIndex() == 4) {	// 4 is VAR, change it if it change later
			this.vars.put(ctx.VAR().getText(), this.vars.get(ctx.expr().getText()));
		}else {
			this.vars.put(ctx.VAR().getText(), Double.parseDouble(ctx.expr().getText()));
		}
		*/
		return val;  //This have to be return the val, as other method depend on it.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fx50BaseVisitor#visitShow(fx50Parser.ShowContext)
	 */
	@Override
	public Double visitShow(fx50Parser.ShowContext ctx) {
		/*
		 * By testing with 10->A/| and 10->A/|A/|, we can see that the let statement is
		 * executed after the show statement. Which it should execute the let statment
		 * first, not show <--ignore this
		 */
		
		Double val = 0.0;
		if(ctx.expr() != null) {
			val = visit(ctx.expr());
			if(val != null)
				System.out.println(val);
		}else if(ctx.let() != null) {
			val = visit(ctx.let());
			if(val != null)
				System.out.println(val);
		}else if(ctx.logicExpr() != null) {
			val = visit(ctx.logicExpr());;
			System.out.println(val);
		}
		/*
		if (ctx.expr() != null) {
			System.out.println(this.vars.get(ctx.expr().getText()));
		}
		else if(ctx.let() != null) {
			System.out.println(ctx.let().getChild(0).getText());
		}
		*/
		return val;
	}
	
	/*
	 * (non-Javadoc)
	 * @see fx50BaseVisitor#visitCal(fx50Parser.CalContext)
	 */
	@Override
	public Double visitCal(fx50Parser.CalContext ctx) {
		double val;
		if(ctx.expr() != null)
			val = visit(ctx.expr());
		else if(ctx.logicExpr()!=null)
			val = visit(ctx.logicExpr());
		else
			val = visit(ctx.logicExprFunc());
		this.vars.put("Ans", val);
		return val;
	}
	
	@Override
	public Double visitParExpr(fx50Parser.ParExprContext ctx) {
		return visit(ctx.par);
	}
	
	/*
	 * (non-Javadoc)
	 * @see fx50BaseVisitor#visitNoopExpr(fx50Parser.NoopExprContext)
	 */
	@Override
	public Double visitNoopExpr(fx50Parser.NoopExprContext ctx) {
		double temp = 1.0;
		boolean isExist = false;
		try {
			for(int i=0;i<ctx.noopmul().value().size();i++) {
				if(visit(ctx.noopmul().value(i)) != null & isExist == false) {
					isExist=true;
					temp *= visit(ctx.noopmul().value(i));
				}else if(ctx.noopmul().value(i).NUM() != null & isExist == true) {
					throw new SyntaxErrorException("Syntax Error at position " +  ctx.noopmul().getStart().getCharPositionInLine() + " to " + ctx.noopmul().getStop().getCharPositionInLine());
				}
				if(ctx.noopmul().expr(i) !=null)
					temp *= visit(ctx.noopmul().expr(i));
				else
					temp *= visit(ctx.noopmul().value(i));
		}
			
		}catch(SyntaxErrorException e) {
			e.printStackTrace();
			return null;
		}
		this.vars.put("Ans", temp);
		return temp;
	}
	
	@Override
	public Double visitValue(fx50Parser.ValueContext ctx) {
		if (ctx.VAR() != null)
			return this.vars.get(ctx.VAR().getText());
		else if(ctx.CONSTANT() != null)
			return this.vars.get(ctx.CONSTANT().getText());
		else
			return Double.parseDouble(ctx.NUM().getText());
	}
	
	/*
	 * (non-Javadoc)
	 * @see fx50BaseVisitor#visitOpExpr(fx50Parser.OpExprContext)
	 */
	@Override
	public Double visitOpExpr(fx50Parser.OpExprContext ctx) {
		double left = visit(ctx.left);
		double right = visit(ctx.right);
		String op = ctx.op.getText();
		switch (op.charAt(0)) {
		case '^':
			this.vars.put("Ans", Math.pow(left, right));
			return Math.pow(left, right);
		case '*':
			this.vars.put("Ans", left * right);
			return left * right;
		case '/':
			this.vars.put("Ans", left / right);
			return left / right;
		case '+':
			this.vars.put("Ans", left + right);
			return left + right;
		case '-':
			this.vars.put("Ans", left - right);
			return left - right;
		default: throw new IllegalArgumentException("Unknown operator " + op);
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see fx50BaseVisitor#visitNegExpr(fx50Parser.NegExprContext)
	 */
	@Override
	public Double visitNegExpr(fx50Parser.NegExprContext ctx) {
		return -visit(ctx.expr());
	}
	
	/*
	 * (non-Javadoc)
	 * @see fx50BaseVisitor#visitRoot(fx50Parser.RootContext)
	 */
	@Override
	public Double visitRoot(fx50Parser.RootContext ctx) {
		return Math.sqrt(visit(ctx.expr()));
	}
	
	@Override
	public Double visitAsk(fx50Parser.AskContext ctx) {
		java.io.BufferedReader buf = new java.io.BufferedReader(   
                new java.io.InputStreamReader(System.in));  
        String c;
        double t=0.0;
        try {
            System.out.print(ctx.VAR().getText()+ "=");
            c=buf.readLine();
            t = Double.parseDouble(c);
            this.vars.put(ctx.VAR().getText(), t);

        } catch (java.io.IOException ex) {
            ex.printStackTrace();
        }
        return t;
	}
	
	/*
	 * (non-Javadoc)
	 * @see fx50BaseVisitor#visitBinExpr(fx50Parser.BinExprContext)
	 * 
	 * Because it is not possible to return boolean (at least for now)
	 * it is forced to use double 1.0 as true, double 0.0 as false
	 */
	@Override
	public Double visitLogicExpr(fx50Parser.LogicExprContext ctx) {
		double left = visit(ctx.left);
		double right = visit(ctx.right);
		String op = ctx.op.getText();
		switch (op) {
		case "=":
			if(left == right) {
				this.vars.put("Ans", 1.0);
				return 1.0;
			}
			this.vars.put("Ans", 0.0);
			return 0.0;
		case "/=":
			if(left != right) {
				this.vars.put("Ans", 1.0);
				return 1.0;
			}
			this.vars.put("Ans", 0.0);
			return 0.0;
		case ">":
			if(left > right) {
				this.vars.put("Ans", 1.0);
				return 1.0;
			}
			this.vars.put("Ans", 0.0);
			return 0.0;
		case "<":
			if(left < right) {
				this.vars.put("Ans", 1.0);
				return 1.0;
			}
			this.vars.put("Ans", 0.0);
			return 0.0;
		case ">=":
			if(left >= right) {
				this.vars.put("Ans", 1.0);
				return 1.0;
			}
			this.vars.put("Ans", 0.0);
			return 0.0;
		case "<=":
			if(left <= right) {
				this.vars.put("Ans", 1.0);
				return 1.0;
			}
			this.vars.put("Ans", 0.0);
			return 0.0;
		default: throw new IllegalArgumentException("Unknown operator " + op);
		}
	}
	
	@Override
	public Double visitIfexpr(fx50Parser.IfexprContext ctx) {
		double val = 0.0;
		//If there is ELSE
		if(ctx.elseExpr() != null) {
			
			if(ctx.expr()!=null) {	//It is an normal expr
				
				if(visit(ctx.expr()) != 0.0) {
					val =  visit(ctx.thenExpr());
				}else {	//If false
					val =  visit(ctx.elseExpr());
				}
				
			}else {	//It is an logic expr
				if(visit(ctx.logicExpr()) == 1.0) {
					val =  visit(ctx.thenExpr());
				}else {	//If false
					val =  visit(ctx.elseExpr());
				}
			}
			
			
		}else {	//If there is not ELSE
			
			if(ctx.expr()!=null) {	//It is an normal expr
				
				if(visit(ctx.expr()) != 0.0) {
					val =  visit(ctx.thenExpr());
				}
				
			}else {	//It is an logic expr
				if(visit(ctx.logicExpr()) == 1.0) {
					val =  visit(ctx.thenExpr());
				}
			}
		}
		return val;
	}
	
	/*
	 * (non-Javadoc)
	 * @see fx50BaseVisitor#visitLogicExprFunc(fx50Parser.LogicExprFuncContext)
	 */
	@Override
	public Double visitLogicExprFunc(fx50Parser.LogicExprFuncContext ctx) {
		double val = visit(ctx.expr());
		val *= visit(ctx.logicExpr());
		this.vars.put("Ans", val);
		return val;
	}

}
