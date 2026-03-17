package numberSystemConverter;

import java.util.HashMap;

public class ConverterContext {
	
	HashMap<String, NumberSystem> map= new HashMap<String, NumberSystem>();
	HexConverter Hex= new HexConverter();
	BinaryConverter Bin= new BinaryConverter();
	
	public ConverterContext() {
		registerSystem();
	}
	public void registerSystem() {
		map.put(Hex.getName().toString(), Hex);
		map.put(Bin.getName().toString(), Bin);
	}
}
