package definitions;



public class Transaction {
	
	public static enum TransactionTypes{
		CouponCashflow,
		VariationMargin
	}
	
	final String sourceWalletAdress;
	final String targetWalletAdress;
	final Double Amount;
	public Transaction(String sourceWallet, String targetWallet, Double Amount) throws Exception{
		this.sourceWalletAdress=sourceWallet;
		this.targetWalletAdress=targetWallet;
		this.Amount=Amount;
	}
	public String getSourceWalletAdress() {
		return sourceWalletAdress;
	}
	public String getTargetWalletAdress() {
		return targetWalletAdress;
	}
	public Double getAmount() {
		return Amount;
	}
	

}
