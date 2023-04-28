/* Suppose you have an interface Internet and a concrete implementation of it called 
    RealInternet that accesses the Internet.

    Now suppose you want to create a ProxyInternet class that provides a restricted 
    access to the RealInternet based on some rules (e.g. security, caching, etc.) 

    In this example, the ProxyInternet class acts as a proxy for the RealInternet. 
    It maintains a list of restricted sites and allows access to the RealInternet 
    only if the requested site is not in the restricted list. If the site is in the 
    restricted list, the ProxyInternet throws an exception.

    In this example, the Client uses the ProxyInternet to connect to google.com and 
    blocked-site.com. Since blocked-site.com is a restricted site, the ProxyInternet 
    throws an exception.

    This way, the ProxyInternet acts as a proxy for the RealInternet and provides 
    additional functionality such as security, caching, and access control.
*/

public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("google.com");
            internet.connectTo("blocked-site.com"); // throws an exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
