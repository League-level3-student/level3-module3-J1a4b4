package _00_Text_Funkifier;

public class CustomString extends SpecialString{

	public CustomString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		for (int i = 0; i < s.length(); i++) {
			String sI = s.substring(i, i + 1);
			if (sI == "a") {
				sI = ".- ";
			}else if (sI == "b") {
				sI = "-... ";
			}else if (sI == "c") {
				sI = "-.-. ";
			}else if (sI == "d") {
				sI = "-.. ";
			}else if (sI == "e") {
				sI = ". ";
			}else if (sI == "f") {
				sI = "..-. ";
			}else if (sI == "g") {
				sI = "--. ";
			}else if (sI == "h") {
				sI = ".... ";
			}else if (sI == "i") {
				sI = ".. ";
			}else if (sI == "j") {
				sI = ".--- ";
			}else if (sI == "k") {
				sI = "-.- ";
			}else if (sI == "l") {
				sI = ".-.. ";
			}else if (sI == "m") {
				sI = "-- ";
			}else if (sI == "n") {
				sI = "-. ";
			}else if (sI == "o") {
				sI = "";
			}
			//Remember to add capitals.
			s = s.substring(0, i) + sI + s.substring(i + 1, s.length());
		}
		return null;
	}

}
