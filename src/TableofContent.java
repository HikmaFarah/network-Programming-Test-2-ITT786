/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohamedhassan
 */
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class TableofContent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       String url = "https://en.wikipedia.org/wiki/Common_Language_Infrastructure";
    Document document = Jsoup.connect(url).get();

    String toc = document.select(".toc").text();

    System.out.println(toc);
    }
    
}
