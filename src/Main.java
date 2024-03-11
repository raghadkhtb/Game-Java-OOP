
public class Main {
	
	public static void main (String[]args) {
		Player1 hussien = new Player1 ("Hussien" , "AK23" , 100);
		//System.out.println(hussien.getName());
		//System.out.println(hussien.getHealth());
		//System.out.println(hussien.getWeapon());
       hussien.damageByGun1();
       hussien.damageByGun2();
       hussien.healPro();
       //hussien.damageByGun2();
		Player2 proHussien = new Player2 ("ProHussien" , "ShotGun" , 80 , true);
		
        //proHussien.damageByGun1();
       // proHussien.heal();
       //proHussien.damageByGun2();
		
}
}