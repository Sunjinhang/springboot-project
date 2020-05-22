package pers.sjh.cloud_note.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.sjh.cloud_note.domain.common.tree.AreaTree;
import pers.sjh.cloud_note.service.system.AreaService;

import java.math.BigInteger;
import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-21 13:22
 */
@Controller
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @RequestMapping("/search")
    @ResponseBody
    public List<AreaTree> getAreaTree(@RequestParam("id") BigInteger parentId){
        List<AreaTree> treeList = areaService.getAreaTree(parentId);
        return treeList;
    }
}
