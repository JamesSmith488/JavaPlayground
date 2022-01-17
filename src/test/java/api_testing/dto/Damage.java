package api_testing.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Damage{

    @JsonProperty("damage_type")
    private DamageType damageType;

    @JsonProperty("damage_at_slot_level")
    private DamageAtSlotLevel damageAtSlotLevel;

    public DamageType getDamageType(){
        return damageType;
    }

    public DamageAtSlotLevel getDamageAtSlotLevel(){
        return damageAtSlotLevel;
    }

    @Override
    public String toString(){
        return
                "Damage{" +
                        "damage_type = '" + damageType + '\'' +
                        ",damage_at_slot_level = '" + damageAtSlotLevel + '\'' +
                        "}";
    }
}