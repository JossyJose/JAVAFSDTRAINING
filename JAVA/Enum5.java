package ust.examples;
enum WhoisRIR{
	ARIN("whois.arin.net"),
	RIPE("whois.ripe.net"),
	AFRINIC("whois.afrinic.net"),
	LACNIC("whois.lacnic.net"),
	JPNIC("whois.nic.ad.jp"),
	KRNIC("whois.nic.or.kr"),
CNNIC("ipwhois.cnnic.cn"),
UNKNOWN(" ");
	private String url;
	WhoisRIR(String url){
		this.url=url;
	}
	public String url(){
		return url;
	}
	
}
public class Enum5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhoisRIR wh = WhoisRIR.AFRINIC;
		System.out.println(wh.url());
	}

}
