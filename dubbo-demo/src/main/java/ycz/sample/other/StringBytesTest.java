package ycz.sample.other;

public class StringBytesTest {

    public static void main(String[] args) {
        String name = "yuanchongzhen";
        byte[] bytes = name.getBytes();
        for (byte b : bytes) {
            //输出数字(字母对应)
            System.out.println(b);
        }
        char[] chars = name.toCharArray();
        for (char c : chars) {
            //输出字母
            System.out.println(c);
        }

        String stringNum = "34.56";
        String[] num = stringNum.split("\\.");
        Long t = 0l;
        for (String s : num) {
            //1 * 10 + 10 + 2 * 10
            char[] s1 = s.toCharArray();
            for (char c : s1) {
                t = (t + Long.valueOf(s)) * 10;
            }
        }
        System.out.println(t);
        Long qd = 7 * 24 * 60 * 60 * 1000l;
        System.out.println(qd);
        Long currend = System.currentTimeMillis();
        System.out.println(qd + currend);
    }
}
