class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}
class EmailDetector{
    public boolean isPresent(String text){
        boolean result = true;
            int index1 = 0;
            index1 = text.indexOf('@');

            if(!(text.contains("@"))){
                result = false;
            } else {
                if(text.charAt(index1+1) == ' ' || text.charAt(index1-1) == ' ' || text.charAt(index1-2) == ' ' || text.charAt(index1+2) == ' '){
                   result = false;

                } else{
                    result = true;
                }
            }




        return result;
    }

}