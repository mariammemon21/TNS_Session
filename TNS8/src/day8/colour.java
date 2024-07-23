package day8;

public class colour {
	//parent class
	protected colour getcolour() {
		colour s = new colour();
		return s;
	}

}

class red extends colour {
	protected red getcolour() {
		red s = new red();
		return s;
	}
	
}

class yellow extends colour {
	protected red getcolour() {
		yellow s =  red();
		return s;
	}
	
}