package arrays;

public class URLify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Mr John Smith    ";
		int len = 13;
		System.out.println(changeString(str,len));
	}

	private static String changeString(String str, int len) {
		// TODO Auto-generated method stub
		if(str.trim().length()!=len)
			return "False";
		else{
			int space = 0;
			for(int i=0;i<len;i++){
				if(str.charAt(i) == ' ')
					space++;
			}
			int truelen = len+2*space;
			char ch[] = str.toCharArray();
			for(int i=len-1;i>=0 && space>0;i--){
				if(ch[i] == ' '){
					ch[truelen-1] = '0';
					ch[truelen-2] = '2';
					ch[truelen-3] = '%';
					truelen-=3;
					space--;
				}
				else{
					ch[truelen-1] = ch[i];
					truelen--;
				}
			}
			String a ="";
			for(int i=0;i<ch.length;i++){
				a+=(ch[i]);
			}
			return a;
		}
	}

}
