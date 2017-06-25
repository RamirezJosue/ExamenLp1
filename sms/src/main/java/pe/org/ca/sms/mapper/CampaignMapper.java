package pe.org.ca.sms.mapper;

import pe.org.ca.sms.domain.Campaign;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author itecs
 */
@Mapper
public interface CampaignMapper {

    @Select("SELECT * FROM campaign")
    List<Campaign> findCampaigns();

    @Delete("DELETE FROM campaign where id = #{id}")
    void removeCampaign(@Param("id") Long id);

    @Update(
            "update campaign "
            + "set nombre=#{campaign.nombre}, "
            + "descripcion=#{campaign.descripcion}, "
            + "estado=#{campaign.estado} "
            + "where id =#{campaign.id}"
    )
    void updateCampaign(@Param("campaign") Campaign campaign);

    @Select("SELECT * FROM campaign where id = #{id}")
    Campaign findCampaignById(@Param("id") Long id);

    @Insert("INSERT INTO campaign(nombre,descripcion,estado) "
            + "values(#{campaign.nombre},"
            + "#{campaign.descripcion},"
            + "#{campaign.estado})")
    void saveCampaign(@Param("campaign") Campaign campaign);
}
