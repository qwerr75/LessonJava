public class Calculator {
	private int result;
/**
*преобразуем типы и делаем арифметический действия
*@param first
*@param second
*@param arithmeticSigns 
*/

	public void add(String ... params){
		 int i=0;
		 Float Ffirst,Fcond;
		 Double Dfirst,Dsecond;
		 String arit;
		for (String param : params){
			i++;
			 boolean g=false;
				for (char element : param.toCharArray()){
                  if(element==',')g=true;
                }
				if(g==true){
					if(i==1)Ffirst=Float.valueOf(param);
					if(i==3)Fcond=Float.valueOf(param);
				}
				if(g==false){
					if(i==1)Dfirst=Double.valueOf(param);
					if(i==3)Dsecond=Double.valueOf(param);
				}
				if(i==2)arit=param;
				
			//this.result= parfirst + parsecond;
			//System.out.println(result);
		}
	}
	/**
	*вернёт результат работы класс
	*@return результат
	*/
	public int getResult(){
		return this.result;
	}
	public void cleanResult(){
		this.result=0;
	}

}