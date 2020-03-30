package Day12;

public class StaticBlock {
	static String company = "»ï¼º";
	static String kind = "LCD";
	static String product = company + "-" + kind;
	static String pro2;
	
	static {
		pro2 = company + "-" + kind;
	}
}
