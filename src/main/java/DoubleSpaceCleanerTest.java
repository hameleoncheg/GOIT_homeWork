class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}class DoubleSpaceCleaner {
    public String clean(String phrase) {
        String asd = phrase.replaceAll("\\s+", " ");
       // System.out.println(asd);
        final String asd1 = asd.trim();
       // System.out.println(asd);
        return asd1;
    }
}