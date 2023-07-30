import java.util.StringTokenizer;

public class StringTokenizertest2 {

	public static void main(String[] args) {
		String party = "풍선/25000, 케익/37000, 폭죽/10000"
				+ ", 샴페인/50000, 꽃다발/75000";
		
		int total = 0;
		
		StringTokenizer stk = new StringTokenizer(party, "/, ");
		StringBuffer buf = new StringBuffer();
		
		System.out.println(">>>>> 총 파티비용 <<<<<<");
		while(stk.hasMoreTokens()) {
			String item = stk.nextToken();
			buf.append(item).append(" ");
			
			int price   = Integer.parseInt(stk.nextToken());
			total += price;
			System.out.println(item +"\t" + price);
		}
		System.out.println("===================");
		System.out.println("총비용: " + String.format("%,d", total));
		System.out.println("파티 아이템: " + buf.toString());
		
		
		
		
		

	}

}
