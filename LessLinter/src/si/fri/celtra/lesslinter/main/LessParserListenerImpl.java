package si.fri.celtra.lesslinter.main;

import si.fri.celtra.lesslinter.antlr.LessParser.ExpressionContext;
import si.fri.celtra.lesslinter.antlr.LessParserBaseListener;

public class LessParserListenerImpl extends LessParserBaseListener {

	@Override
	public void enterExpression(ExpressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterExpression(ctx);
	}
}