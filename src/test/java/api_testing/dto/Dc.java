package api_testing.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dc{

    @JsonProperty("dc_type")
    private DcType dcType;

    @JsonProperty("dc_success")
    private String dcSuccess;

    public DcType getDcType(){
        return dcType;
    }

    public String getDcSuccess(){
        return dcSuccess;
    }

    @Override
    public String toString(){
        return
                "Dc{" +
                        "dc_type = '" + dcType + '\'' +
                        ",dc_success = '" + dcSuccess + '\'' +
                        "}";
    }
}