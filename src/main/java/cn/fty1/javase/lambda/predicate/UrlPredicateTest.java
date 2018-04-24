package cn.fty1.javase.lambda.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UrlPredicateTest {

    public static void main(String[] args) {

        String baiduUrl = "http://www.baidu.com";
        String juejingUrl = "https://juejin.im";
        List<String> urls = Arrays.asList("http://www.baidu.com","https://juejin.im/");
        List<UrlEvent> urlEvents = new ArrayList<>();
        urls.forEach(n -> urlEvents.add(new UrlEvent(n)));
        Predicate<UrlEvent> urlEventPredicate = (n) -> n.isStatus();
        //Predicate<UrlEvent> baiduUrlEventPredicate = (n) -> UrlUtils.opurl(baiduUrl).isStatus();
        //Predicate<UrlEvent> juejingUrlEventPredicate = (n) -> UrlUtils.opurl(juejingUrl).isStatus();
        urlEvents.stream().map(n -> UrlUtils.opurl(n)).forEach(n -> System.out.println(n.getUrl()+n.getCurTime()));
    }
}
