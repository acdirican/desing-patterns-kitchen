package behavioral.strategy;

public class Context {
	   private OperationStrategy strategy;

	   public Context(OperationStrategy strategy){
	      this.strategy = strategy;
	   }

	   public int executeStrategy(int num1, int num2){
	      return strategy.doOperation(num1, num2);
	   }

	public void setStrategy(OperationStrategy strategy) {
		this.strategy = strategy;
	}
	}