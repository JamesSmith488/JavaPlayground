package api_testing.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AreaOfEffect{

    @JsonProperty("size")
    private Integer size;

    @JsonProperty("type")
    private String type;

    public Integer getSize(){
        return size;
    }

    public String getType(){
        return type;
    }

    @Override
    public String toString(){
        return
                "AreaOfEffect{" +
                        "size = '" + size + '\'' +
                        ",type = '" + type + '\'' +
                        "}";
    }
}