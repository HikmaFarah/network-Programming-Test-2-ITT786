import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.net.URL;
import java.util.Scanner;

public class WebRefrences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String address = "https://en.wikipedia.org/wiki/Common_Language_Infrastructure";
        URL pageLocation = new URL (address);
        Scanner in = new Scanner(pageLocation.openStream());
        
        while (in.hasNext()){
            String line = in.next();
            if (line.contains("href=\"http://")){
                int from = line .indexOf("\"");
                int to =line.lastIndexOf("\"");
                System.out.print(line.substring(from + 1, to));
                
            }
        }
        
 
    }
    
}