import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class spider {
    public static void main(String[] args) throws IOException {
        String url="";//地址
        Document document = Jsoup.parse(new URL(url), 10000);
        Element content = document.getElementById("");
        //dir标签里的id
        Elements imgs = content.getElementsByTag("img");
        for (Element img : imgs) {
            String src = img.attr("data-src");
            URL target = new URL(src);
            URLConnection con = target.openConnection();
            InputStream in = con.getInputStream();
          OutputStream out = new FileOutputStream("images/"+src);
          int temp=0;
          while((temp=in.read())!=-1){
              out.write(temp);
          }
          in.close();
          out.close();
        }

    }
}
