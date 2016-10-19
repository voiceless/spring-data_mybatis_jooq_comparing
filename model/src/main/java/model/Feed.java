package model;

import org.apache.ibatis.type.Alias;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pbezglasnyi on 13.10.2016.
 */
@Alias("Feed")
@Entity
@NamedEntityGraph(name = "Feed.projects", attributeNodes = @NamedAttributeNode("projects"))
public class Feed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "FEED_PROJ",
            joinColumns = @JoinColumn(name = "feed_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "proj_id", referencedColumnName = "id")
    )
    private List<Project> projects = new ArrayList<>();

    public Feed() {
    }

    public Feed(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Feed(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Feed{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", projects=" + projects +
                '}';
    }
}
