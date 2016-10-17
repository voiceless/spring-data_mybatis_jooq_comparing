package model;

import org.apache.ibatis.type.Alias;

import javax.persistence.*;

/**
 * Created by pbezglasnyi on 13.10.2016.
 */
@Alias("FeedInstanceException")
@Entity
public class FeedInstanceException {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "feedInstanceId")
    private FeedInstance feedInstance;
    private String description;

    public FeedInstanceException() {
    }

    public FeedInstanceException(FeedInstance feedInstance, String description) {
        this.feedInstance = feedInstance;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FeedInstance getFeedInstance() {
        return feedInstance;
    }

    public void setFeedInstance(FeedInstance feedInstance) {
        this.feedInstance = feedInstance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "FeedInstanceException{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
