package numberSystemConverter;

public class BinaryConverter implements NumberSystem {

	public String getName() {
		return "Bin";
	}

	public String convert(int n) throws IllegalArgumentException {
		if (n<0) {
			throw new IllegalArgumentException("negative numbers not supported");
		}
		else {
			return Integer.toBinaryString(n);
		}
	}
	
}
