import java.util.Random;//importing package
class Bulbdemo {
	String brand;
	int wattage;
	boolean state;
	Bulbdemo(String b, int w, boolean s) {
		this.brand = b;
		this.wattage = w;
		this.state = s;
	}
	public void showStatus() {
		System.out.println(brand +"|" + wattage +"W:|" + "Bulb State:" +(state ?"On":"Off"));
	}
	public void toggle() {
		state =! state;
		System.out.println("Bulb Switching state:"+(state ? "ON":"OFF") );//ternary operator to show state after toggling
	}

}
public class bulb {
	public static void main(String[] args) {
		Random rand = new Random();
		Bulbdemo[] b = new Bulbdemo[10];//Creating an empty array of size 10
		//intializing array objects
		for(int i = 0 ; i<b.length ; i++) {
			boolean randomstate = rand.nextBoolean();//intializing object with random values
			b[i] = new Bulbdemo("brand-"+(i+1),(60+i),randomstate);
		}
//displaying bulb status with their position
		for(int i= 0; i<b.length ; i++) {
			System.out.println("Bulb "+i+":");//show bulb with index
			b[i].showStatus();
			System.out.println("");
		}
		//dispalying count 
		int oncount = 0;
		int offcount =0;
		for(int i = 0; i<b.length ; i++) {
			if(b[i].state)
				oncount++;
			else
				offcount++;
			
		}
		System.out.println("Total On Bulbs:"+(oncount));
		System.out.println("Total Off Bulbs:"+(offcount));
			System.out.println("");
			

			System.out.print("Bulbs ON at positions: ");
for(int i = 0; i < b.length; i++) {
    if(b[i].state)
        System.out.print(i + " ");
}
System.out.println("\n");

		//displaying on bulb percentage
		double percent = (oncount * 100.0)/(b.length);
		System.out.println(" On Bulb Percentage :" + percent + "%");
		System.out.println("");
		//flipping bulb state
		for(int i = 0; i<b.length ;i++){
		    b[i].toggle();
		    System.out.println("");
		}
//flipping count
		int toncount=0;
		int toffcount =0;
		for(int i = 0 ; i<b.length ; i++){
		    if(b[i].state)
		    toncount++;
		    else 
		    toffcount++;
		}
		System.out.println("Total On Bulbs after flipping:"+(toncount));
		System.out.println("Total Off  Bulbs after flipping:"+(toffcount));
			System.out.println("");
			
		double tpercent = (toncount *100.0)/(b.length);//tpercent for toggled value
		System.out.println(" On Bulb Percentage after flipping :" + tpercent + "%");
		
	}
}