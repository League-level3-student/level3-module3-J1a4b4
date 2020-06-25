package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String sI = "";
		for (int i = 0; i < s.length(); i++) {
			sI = s.substring(i, i + 1);
			if (i % 2 == 0) {
				sI = sI.toLowerCase();
			}else if (i % 2 == 1) {
				sI = sI.toUpperCase();
			}
			s = s.substring(0, i) + sI + s.substring(i + 1, s.length());
		}
		return s;
	}

}
