package etc;

public class CallStackTest {

	public static void main(String[] args) {
		initMethod("first Call", 0);

	}
	public static void initMethod(String name, int number){
		callMethod(name, number);
	}
	public static void callMethod(String name, int number){
		//???? κ°μ΄ 2?°? ?¬κ·??ΈμΆμ ?ΈμΆ? ??
		//μ’λ£ μ‘°κ±΄ ? κΉμ? μ²«λ²μ§? ?¬κ·??ΈμΆμ κ³μ??€..
		//?ΈμΆλ λ§λ€ λ³???? μ‘°κ±΄? ?κ²¨μ£Ό?΄ μ’λ£μ‘°κ±΄? μ£Όμ΄ ?ΈμΆν?€.
		//μ’λ£ μ‘°κ±΄?΄ λ§μ‘±?λ©? ?΄?Ή ?ΈμΆμ? μ’λ£?κ³? ?ΈμΆν ?¨?? ?€? ?¬κ·?λ₯? ?ΈμΆν?€.
		//?λ²μ§Έ ?¬κ·?κ°? μ’λ£μ‘°κ±΄?Όλ‘? μ’λ£ ?λ©? ?ΈμΆν ?¨?? μ’λ£(λ°ν) ??€.....
		if(number < 2){
			number++;
			System.out.println(name + " | " + number);
			callMethod("callMethod1_" + number, number);
			callMethod("callMethod2_"+ number, number);
		}
	}

}
