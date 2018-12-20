import com.mytomcat.MyTomcat;
import servlet.MyServletMappingConfig;

public class Main {

    public static void main(String[] args) {
        MyServletMappingConfig config = new MyServletMappingConfig();
        config.init();
        new MyTomcat(8080).start();
    }
}
