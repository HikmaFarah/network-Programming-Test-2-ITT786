import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WebSource {

    public static void main(String[] args) throws Exception {

        final Document document = Jsoup.connect("https://en.wikipedia.org/wiki/Common_Language_Infrastructure").get();

        

            System.out.println(document.outerHtml());
        }
    }

