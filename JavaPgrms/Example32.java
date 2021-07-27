package ust.examples;

class Example32 {
	
	private String formatNumber(int value) {
		return String.format("%d", value);
	}
	
	private String FormatNumber(double value) {
		return String.format("%.3f",value);
	}
	private String FormatNumber(String value) {
		
		return String.format("%.2f",Double.parseDouble(value));
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example32 hs= new Example32();
		System.out.println(hs.FormatNumber(500));
		System.out.println(hs.FormatNumber(89.9934f));
		System.out.println(hs.FormatNumber("500f"));
		
	}

}
