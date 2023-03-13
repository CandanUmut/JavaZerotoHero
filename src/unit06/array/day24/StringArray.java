package unit06.array.day24;

public class StringArray {
    public static void main(String[] args) {
        String []StringArray={"cat", "fish","cow","doggyyy"};

        for (int i = 0; i < StringArray.length; i++) {
            String a = (StringArray[i].substring(0,1));
            StringArray[i]=(a.toUpperCase()+StringArray[i].substring(1));
            System.out.println(StringArray[i]);



            System.out.println(" "+StringArray[i].length());

        }

    }



}
