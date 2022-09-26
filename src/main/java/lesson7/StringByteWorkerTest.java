package lesson7;

import java.nio.charset.Charset;

class StringByteWorkerTest {
    public static void main(String[] args) {
        byte[] startBytes = {74, 97, 86, 97};

        //java
        System.out.println(new StringByteWorker().process(startBytes));
    }
}
class StringByteWorker {
    public String process(byte[] bytes){
        String s = new String(bytes, Charset.defaultCharset());

        return s.toLowerCase();
    }
}