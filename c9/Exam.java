//       Технологично училище "Електронни системи"
//       http://www.elsys-bg.org/
//       11Б клас
//	Благовест Божинов
//	Номер 5
// Програмата чете името на CSV файл от командния ред.
// Отваря файла и събира числата в 2-та колона.
// На екрана се извежда сбора им.

import java.io.*;

public class Exam{
	public static void main(String [] args){
		String fileName=null;
		
		if(args.length>0){
			fileName=args[0];
		}else{
			System.out.println("Wrong filename");
			return;
		}
		try{
			BufferedReader reader=new BufferedReader(new FileReader(fileName));
			String line;
			int sum=0;
			while((line=reader.readLine())!=null){
				sum+=Integer.parseInt(line.split(",")[1]);
			}
			System.out.println(sum);		
		}catch(Exception e){
		
		}
	}
}
