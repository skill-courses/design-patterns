package structural_patterns.proxy;

public class HKNetworkProxy implements Search {
    private Search search;

    public HKNetworkProxy() {
        this.search = new Google();
    }

    @Override
    public String querying(String url) {
        if ("https://www.youtube.com/".equals(url)) {
            return search.querying(url);
        }
        return "不能访问违禁网站！";
    }
}
