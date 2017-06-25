
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.org.ca.sms.web.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pe.org.ca.sms.domain.Campaign;
import pe.org.ca.sms.service.CampaignServiceImpl;

/**
 *
 * @author itecs
 */
@RestController
@RequestMapping("/campaign")
public class CampaignController {

    @Autowired
    CampaignServiceImpl campaignService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Campaign> allCampaigns() {
        return campaignService.findCampaigns();
    }

    @RequestMapping(value = "/edit", method = {RequestMethod.GET, RequestMethod.POST})
    public void editCampaign(@RequestBody Campaign campaign) {
        campaignService.updateCampaign(campaign);
    }

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
    public void removeCampaign(@PathVariable Long id) {
        campaignService.removeCampaign(id);
    }

    @RequestMapping(value = "find/{id}", method = RequestMethod.GET)
    public Campaign findCampaign(@PathVariable Long id) {
        return campaignService.findCampaignById(id);
    }

    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public void saveCampaign(@RequestBody Campaign campaign) {
        campaignService.saveCampaign(campaign);
    }

}
