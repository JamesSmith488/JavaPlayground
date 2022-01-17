package api_testing.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubclassesItem{

    @JsonProperty("name")
    private String name;

    @JsonProperty("index")
    private String index;

    @JsonProperty("url")
    private String url;

    public String getName(){
        return name;
    }

    public String getIndex(){
        return index;
    }

    public String getUrl(){
        return url;
    }

    @Override
    public String toString(){
        return
                "SubclassesItem{" +
                        "name = '" + name + '\'' +
                        ",index = '" + index + '\'' +
                        ",url = '" + url + '\'' +
                        "}";
    }
}