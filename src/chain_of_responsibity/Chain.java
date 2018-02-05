package chain_of_responsibity;

public interface Chain {
	
	void setNextChain(Chain nextChain);
	
	void calculate(Load request);

}
