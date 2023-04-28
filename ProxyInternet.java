import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private Internet realInternet;
    private List<String> restrictedSites;

    public ProxyInternet() {
        this.realInternet = new RealInternet();
        this.restrictedSites = new ArrayList<>();
        restrictedSites.add("blocked-site.com");
    }

    public void connectTo(String serverHost) throws Exception {
        if (restrictedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access Denied");
        }
        realInternet.connectTo(serverHost);
    }
}

