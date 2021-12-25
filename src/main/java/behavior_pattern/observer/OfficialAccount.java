package behavior_pattern.observer;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class OfficialAccount {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void addArticle(Article article) {
        String message = "最新文章《" + article.getTitle() + "》已经发布，请速来围观！";
        subscribers.forEach(subscriber -> {
            subscriber.receive(message);
        });
    }
}
