package vpet;

public class VirtualPet {

	// Instance Variables

	private String name = "Horace";
	private int boredom = 15;
	private int tiredness = 10;
	private int hunger = 20;
	private int thirst = 35;
	private int sleep = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBoredom() {
		return boredom;
	}

	public void setBoredom(int boredom) {
		this.boredom = boredom;
	}

	public int getTiredness() {
		return tiredness;
	}

	public void setTiredness(int tiredness) {
		this.tiredness = tiredness;
	}

	// default constructor
	public VirtualPet() {

	}

	// Loaded Constructor
	public VirtualPet(String name, int boredom) {
		super();
		this.name = name;
		this.boredom = boredom;
	}

	public void playWithPet() {
		boredom -= 15;

	}

	public void Sleep() {
		tiredness = tiredness - 5;
	}

	public void tick() {
		this.setBoredom(15);
		this.setTiredness(10);
		this.setHunger(20);;
		this.setThirst(35);;
		this.setSleep(0);
		
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public void setThirst(int thirst) {
		this.thirst = thirst;
	}

	public void feedPet() {
		this.hunger -= 10;
		this.thirst += 5 ;
		this.boredom -= 10;
		this.tiredness += 10;
	}

	public void waterPet() {
		this.thirst -= 15;
		this.boredom -=8;
		this.tiredness +=5;

	}

	public void putPetToSleep() {
		this.sleep += 30;
		this.tiredness +=15;
		this.boredom -=35;
		this.hunger -=5;
		
	}

	public void doNothing() {

	}

	public int getSleep() {
		return sleep;
	}

	public void setSleep(int sleep) {
		this.sleep = sleep;
	}
	
}
