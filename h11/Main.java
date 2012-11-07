// Технологично училище "Електронни системи"
// http://www.elsys-bg.org/
// 11Б клас
// Благовест Божинов
// Номер 5
// Линк към задача: 
// http://lubo.elsys-bg.org/6-092January--IAP--2006/NR/rdonlyres/Electrical-Engineering-and-Computer-Science/6-092January--IAP--2006/A9BBE90D-1D67-4B69-8E38-5E6DA4887C73/0/problem7.pdf

package com.bogger.KypaB.homework10.code

public class Main {
	Ball b1 = new Ball();
	Box box = new Box(7);
	System.out.println(box.size());
	System.out.println(box.getCapacity()); 
	box.add(b1); 
	System.out.println(box.size()); 
	System.out.println(box.getCapacity());
	System.out.println(box.contains(b1)); 
	Ball b2 = new Ball();
	box.add(b2);
	System.out.println(box.getCapacity());
	System.out.println(box.contains(b2)); 
	box.remove(b1);
	System.out.println(box.getCapacity());
	System.out.println(box.contains(b1)); 
}

}