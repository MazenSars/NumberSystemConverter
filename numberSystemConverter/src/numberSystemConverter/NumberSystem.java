package numberSystemConverter;

public interface NumberSystem {
	public String getName();
	public String convert(int n) throws IllegalArgumentException;
}
