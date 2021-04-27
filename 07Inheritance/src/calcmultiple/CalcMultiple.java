package calcmultiple;

//import calcminus.CalcMinus; //package.ClassName
import calcminus.*;// calcminus 안에 모든 클래스를 임포트

public class CalcMultiple extends CalcMinus{
	public CalcMultiple(){
		super();
	}
	
	public CalcMultiple(int sum){
		super(sum);
	}
	public int computeMultiple(int x) {
		this.sum *= x;
		return this.sum;
	}
}
