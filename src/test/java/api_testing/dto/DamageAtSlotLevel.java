package api_testing.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DamageAtSlotLevel{

    @JsonProperty("1")
    private String jsonMember1;

    @JsonProperty("2")
    private String jsonMember2;

    @JsonProperty("3")
    private String jsonMember3;

    @JsonProperty("4")
    private String jsonMember4;

    @JsonProperty("5")
    private String jsonMember5;

    @JsonProperty("6")
    private String jsonMember6;

    @JsonProperty("7")
    private String jsonMember7;

    @JsonProperty("8")
    private String jsonMember8;

    @JsonProperty("9")
    private String jsonMember9;

    public String getJsonMember1(){
        return jsonMember1;
    }

    public String getJsonMember2(){
        return jsonMember2;
    }

    public String getJsonMember3(){
        return jsonMember3;
    }

    public String getJsonMember4(){
        return jsonMember4;
    }

    public String getJsonMember5(){
        return jsonMember5;
    }

    public String getJsonMember6(){
        return jsonMember6;
    }

    public String getJsonMember7(){
        return jsonMember7;
    }

    public String getJsonMember8(){
        return jsonMember8;
    }

    public String getJsonMember9(){
        return jsonMember9;
    }

    @Override
    public String toString(){
        return
                "DamageAtSlotLevel{" +
                        "1 = '" + jsonMember1 + '\'' +
                        ",2 = '" + jsonMember2 + '\'' +
                        ",3 = '" + jsonMember3 + '\'' +
                        ",4 = '" + jsonMember4 + '\'' +
                        ",5 = '" + jsonMember5 + '\'' +
                        ",6 = '" + jsonMember6 + '\'' +
                        ",7 = '" + jsonMember7 + '\'' +
                        ",8 = '" + jsonMember8 + '\'' +
                        ",9 = '" + jsonMember9 + '\'' +
                        "}";
    }
}