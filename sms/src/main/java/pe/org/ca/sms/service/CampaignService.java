/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.org.ca.sms.service;

import java.util.List;
import pe.org.ca.sms.domain.Campaign;

/**
 *
 * @author josmarl
 */
public interface CampaignService {

    public List<Campaign> findCampaigns();

    void removeCampaign(Long id);

    void updateCampaign(Campaign campaign);

    Campaign findCampaignById(Long id);
    
    void saveCampaign(Campaign campaign);
}
