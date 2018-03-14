package definitions;

import java.util.Map;

public class Wallet {
	
	private String address;
	
	private enum BufferType{
		VariationMarginBuffer,
		PenaltyMarginBuffer
	}
	
	private Map<BufferType,Double>	bufferMap;
	
	public Wallet(String address){
		
	}
	

	
	

}
