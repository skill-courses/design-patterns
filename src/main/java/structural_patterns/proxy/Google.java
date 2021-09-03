package structural_patterns.proxy;

public class Google implements Search{
    @Override
    public String querying(String url) {
        return "欢迎来到YuTuBe, 这里有海量的视频供你随心观看哦！";
    }
}
