package plugins;

import numberSystemConverter.NumberSystem;

public class HexConverter implements NumberSystem {

	public String getName() {
		return "Hex";
	}

	public String convert(int n) throws IllegalArgumentException {
		if (n<0) {
			throw new IllegalArgumentException("negative numbers not supported");
		}
		else {
			return Integer.toHexString(n);
		}
	}
	
}
