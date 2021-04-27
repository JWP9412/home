package calcdivide;

//import calcminus.CalcMinus; //package.ClassName
import calcmultiple.*;

public class CalcDivide extends CalcMultiple{
	public CalcDivide(){
		super();
	}
	
	public CalcDivide(int sum){
		super(sum);
	}
	/*
	 * final ¸Þ¼Òµå
	 */
	public final int computeDivide(int x) {
		this.sum /= x;
		return this.sum;
	}
}
