import java.util.Scanner;

/**
*interactRunner.java класс для запуска калькулятора поддерживает ввод пользователя
*@author afanasev
*@since 08.01.2018
*@version 1
*/
public class interactRunner{
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			String arithmeticSigns="+";
			while(!exit.equals("exit")){
				System.out.println(" first : ");
				String first = reader.next();
				System.out.println(" second : ");
				String second = reader.next();
				//calc.add(Integer.valueOf(first),Integer.valueOf(second));
				calc.add(first,second,arithmeticSigns);
				System.out.println("Result :" + calc.getResult());
				calc.cleanResult();
				System.out.println("exit: es");
				exit=reader.next();
			}
		}finally{
			reader.close();
		}
	}
}