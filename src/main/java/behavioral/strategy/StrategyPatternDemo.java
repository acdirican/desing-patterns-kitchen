package behavioral.strategy;

public class StrategyPatternDemo {
		static  Context context ;
	   public static void main(String[] args) {
	       context = new Context(new OperationAdd());		
	      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

	      context.setStrategy(new OperationSubstract());		
	      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

	      context.setStrategy(new OperationMultiply());		
	      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	   }
	}