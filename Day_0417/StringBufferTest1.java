
public class StringBufferTest1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("용량: " + sb.capacity());
		
		String temp = "동해물과 백두산이 ";
		System.out.println("글자개수:" + temp.length());
		
		StringBuffer sb2 = new StringBuffer("동해물과 백두산이 ");
		System.out.println("용량: " + sb2.capacity());
		sb2.append("닳도록 ");
		sb2.insert(10, "마르고 ");
		System.out.println(sb2);
		System.out.println("글자개수: " + sb2.length());
		System.out.println("용량: " + sb2.capacity());
		
		sb2.delete(0, 5);
		System.out.println(sb2);
		// System.out.println(sb2.reverse());
		
		sb2.trimToSize();
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		String data = sb2.toString();
	}

}
