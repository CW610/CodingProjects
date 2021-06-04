package question12;

public class RemoveSpace {
	public static void main(String[] args)
    {
        String str = "      Red   Orange  Yellow        ";
       
        // Call the replaceAll() method to get rid of the spaces
        str = str.replaceAll("\\s", "");
       
        System.out.println(str);
    }

}
