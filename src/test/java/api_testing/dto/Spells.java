package api_testing.dto;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Spells{

    @JsonProperty("damage")
    private Damage damage;

    @JsonProperty("components")
    private List<String> components;

    @JsonProperty("ritual")
    private Boolean ritual;

    @JsonProperty("level")
    private Integer level;

    @JsonProperty("classes")
    private List<ClassesItem> classes;

    @JsonProperty("index")
    private String index;

    @JsonProperty("range")
    private String range;

    @JsonProperty("concentration")
    private Boolean concentration;

    @JsonProperty("url")
    private String url;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("school")
    private School school;

    @JsonProperty("name")
    private String name;

    @JsonProperty("higher_level")
    private List<String> higherLevel;

    @JsonProperty("area_of_effect")
    private AreaOfEffect areaOfEffect;

    @JsonProperty("casting_time")
    private String castingTime;

    @JsonProperty("subclasses")
    private List<SubclassesItem> subclasses;

    @JsonProperty("desc")
    private List<String> desc;

    @JsonProperty("dc")
    private Dc dc;

    public Damage getDamage(){
        return damage;
    }

    public List<String> getComponents(){
        return components;
    }

    public Boolean isRitual(){
        return ritual;
    }

    public Integer getLevel(){
        return level;
    }

    public List<ClassesItem> getClasses(){
        return classes;
    }

    public String getIndex(){
        return index;
    }

    public String getRange(){
        return range;
    }

    public Boolean isConcentration(){
        return concentration;
    }

    public String getUrl(){
        return url;
    }

    public String getDuration(){
        return duration;
    }

    public School getSchool(){
        return school;
    }

    public String getName(){
        return name;
    }

    public List<String> getHigherLevel(){
        return higherLevel;
    }

    public AreaOfEffect getAreaOfEffect(){
        return areaOfEffect;
    }

    public String getCastingTime(){
        return castingTime;
    }

    public List<SubclassesItem> getSubclasses(){
        return subclasses;
    }

    public List<String> getDesc(){
        return desc;
    }

    public Dc getDc(){
        return dc;
    }

    public boolean hasDamage() {
        return damage.getClass() == Damage.class;
    }

    public boolean hasComponents() {
        return components.getClass() == ArrayList.class;
    }

    public boolean hasLevel() {
        return level.getClass() == Integer.class;
    }

    @Override
    public String toString(){
        return "Spells{" +
                "damage = '" + damage + '\'' +
                ",components = '" + components + '\'' +
                ",ritual = '" + ritual + '\'' +
                ",level = '" + level + '\'' +
                ",classes = '" + classes + '\'' +
                ",index = '" + index + '\'' +
                ",range = '" + range + '\'' +
                ",concentration = '" + concentration + '\'' +
                ",url = '" + url + '\'' +
                ",duration = '" + duration + '\'' +
                ",school = '" + school + '\'' +
                ",name = '" + name + '\'' +
                ",higher_level = '" + higherLevel + '\'' +
                ",area_of_effect = '" + areaOfEffect + '\'' +
                ",casting_time = '" + castingTime + '\'' +
                ",subclasses = '" + subclasses + '\'' +
                ",desc = '" + desc + '\'' +
                ",dc = '" + dc + '\'' +
                "}";
    }

}