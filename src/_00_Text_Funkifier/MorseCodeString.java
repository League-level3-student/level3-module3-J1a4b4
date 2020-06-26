package _00_Text_Funkifier;

public class MorseCodeString extends SpecialString{

	public MorseCodeString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String sI = "";
		for (int i = 0; i < s.length(); i++) {
			sI = s.substring(i, i + 1);
			if (sI.equals("a")) {
				sI = ".- ";
			}else if (sI.equals("b")) {
				sI = "-... ";
			}else if (sI.equals("c")) {
				sI = "-.-. ";
			}else if (sI.equals("d")) {
				sI = "-.. ";
			}else if (sI.equals("e")) {
				sI = ". ";
			}else if (sI.equals("f")) {
				sI = "..-. ";
			}else if (sI.equals("g")) {
				sI = "--. ";
			}else if (sI.equals("h")) {
				sI = ".... ";
			}else if (sI.equals("i")) {
				sI = ".. ";
			}else if (sI.equals("j")) {
				sI = ".--- ";
			}else if (sI.equals("k")) {
				sI = "-.- ";
			}else if (sI.equals("l")) {
				sI = ".-.. ";
			}else if (sI.equals("m")) {
				sI = "-- ";
			}else if (sI.equals("n")) {
				sI = "-. ";
			}else if (sI.equals("o")) {
				sI = "--- ";
			}else if (sI.equals("p")) {
				sI = ".--. ";
			}else if (sI.equals("q")) {
				sI = "--.- ";
			}else if (sI.equals("r")) {
				sI = ".-. ";
			}else if (sI.equals("s")) {
				sI = "... ";
			}else if (sI.equals("t")) {
				sI = "- ";
			}else if (sI.equals("u")) {
				sI = "..- ";
			}else if (sI.equals("v")) {
				sI = "...- ";
			}else if (sI.equals("w")) {
				sI = ".--  ";
			}else if (sI.equals("x")) {
				sI = "-..- ";
			}else if (sI.equals("y")) {
				sI = "-.-- ";
			}else if (sI.equals("z")) {
				sI = "--.. ";
			}else if (sI.equals("A")) {
				sI = ".- ";
			}else if (sI.equals("B")) {
				sI = "-... ";
			}else if (sI.equals("C")) {
				sI = "-.-. ";
			}else if (sI.equals("D")) {
				sI = "-.. ";
			}else if (sI.equals("E")) {
				sI = ". ";
			}else if (sI.equals("F")) {
				sI = "..-. ";
			}else if (sI.equals("G")) {
				sI = "--. ";
			}else if (sI.equals("H")) {
				sI = ".... ";
			}else if (sI.equals("I")) {
				sI = ".. ";
			}else if (sI.equals("J")) {
				sI = ".--- ";
			}else if (sI.equals("K")) {
				sI = "-.- ";
			}else if (sI.equals("L")) {
				sI = ".-.. ";
			}else if (sI.equals("M")) {
				sI = "-- ";
			}else if (sI.equals("N")) {
				sI = "-. ";
			}else if (sI.equals("O")) {
				sI = "--- ";
			}else if (sI.equals("P")) {
				sI = ".--. ";
			}else if (sI.equals("Q")) {
				sI = "--.- ";
			}else if (sI.equals("R")) {
				sI = ".-. ";
			}else if (sI.equals("S")) {
				sI = "... ";
			}else if (sI.equals("T")) {
				sI = "- ";
			}else if (sI.equals("U")) {
				sI = "..- ";
			}else if (sI.equals("V")) {
				sI = "...- ";
			}else if (sI.equals("W")) {
				sI = ".--  ";
			}else if (sI.equals("X")) {
				sI = "-..- ";
			}else if (sI.equals("Y")) {
				sI = "-.-- ";
			}else if (sI.equals("Z")) {
				sI = "--.. ";
			}
		s = s.substring(0, i) + sI + s.substring(i + 1, s.length());
		}
		return s;
	}

}
