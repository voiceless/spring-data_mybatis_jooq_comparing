package model;

import org.apache.ibatis.type.Alias;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pbezglasnyi on 13.10.2016.
 */
@Alias("FeedInstance")
@Entity
public class FeedInstance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JoinColumn(name = "feedId")
    @ManyToOne(fetch = FetchType.EAGER)
    private Feed feed;
    private LocalDateTime date;
    private String description;
    @OneToMany(mappedBy = "feedInstance", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<FeedInstanceException> exceptions = new ArrayList<>();

    public FeedInstance() {
    }

    public FeedInstance(Feed feed, LocalDateTime date, String description) {
        this.feed = feed;
        this.date = date;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Feed getFeed() {
        return feed;
    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<FeedInstanceException> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<FeedInstanceException> exceptions) {
        this.exceptions = exceptions;
    }

    @Override
    public String toString() {
        return "FeedInstance{" +
                "id=" + id +
                ", feed=" + feed +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", exceptions=" + exceptions +
                '}';
    }
}
