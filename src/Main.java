import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args)
    {
        File text = new File("text.txt");
        try
        {
            text.createNewFile();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            FileWriter writer = new FileWriter("text.txt");
            writer.write("This is the text you will save to your file.");
            writer.write("\nUse this escape character to add text to the next line.");
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}