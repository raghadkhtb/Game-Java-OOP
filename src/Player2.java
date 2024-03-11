
public class Player2 extends Player1 {
private int health;
private boolean shield;
public Player2(String name, String weapon, int health , boolean shield) {
	super(name,weapon,health);
	this.health = health;
	this.shield = shield ;
	
}
@Override
public void damageByGun1() {
	if (shield) {
		this.health -= 10;
		if (this.health <= 0 ) this.health = 0;
		System.out.println("Shield is ON! Got hit by Gun1. Health is reduced by 10. New health is " + this.health);
	}
		if (!shield) {
			this.health -= 40;
			if (this.health <= 0 ) this.health = 0;
			System.out.println("SHield is OFF! Got hit by Gun1. Health is reduced by 40. New health is " + this.health);
	}
}
@Override
public void damageByGun2() {
	if (shield) {
		this.health -= 20;
		if (this.health <= 0 ) this.health = 0;
		System.out.println("SHield is ON! Got hit by Gun2. Health is reduced by 20. New health is " + this.health);
	}
	if (!shield) {
		this.health -= 70;
		if (this.health <= 0 ) this.health = 0;
		System.out.println("SHield is OFF! Got hit by Gun2. Health is reduced by 70. New health is " + this.health);
	}

}
@Override
public void heal() {
	// TODO Auto-generated method stub
	super.heal();
}
@Override
public void healPro() {
	// TODO Auto-generated method stub
	super.healPro();
}

	
}


