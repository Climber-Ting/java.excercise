public class MyAtoi {
    public static void main(String[] args) {
        String s="   -42";
        int a=(int)Math.pow(2,31);
        int ret=myAtoi(s);


        System.out.println(ret);
    }
    public static int myAtoi(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int i=0;
        char ch=' ';
        long ret=0;
        while(i<s.length()) {
            if (s.charAt(i) == ' ') {
                i++;
            } else {
                break;
            }
        }
        if (i<s.length()) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                ch = s.charAt(i);
                i++;
            }
        }
        else {
            return 0;
        }
        while(i<s.length()){
            if (s.charAt(i)>='0'&&s.charAt(i)<='9'){
                if (ch=='-'&& ret>Math.pow(2,31)+1){
                    return -(int)Math.pow(2,31)-1;
                }
                else if (ret>Math.pow(2,31)){
                    return (int)Math.pow(2,31);
                }
                ret*=10;
                ret+=((int)s.charAt(i)-48);
                i++;
            }
            else {
                break;
            }
        }
        if (ch=='-'&& ret>(int)Math.pow(2,31)){
            return -(int)Math.pow(2,31)-1;
        }
        else if (ret>(int)Math.pow(2,31)){
            return (int)Math.pow(2,31);
        }
        if (ch=='-'){
            return -(int)ret;
        }
        return (int)ret;
    }
}
