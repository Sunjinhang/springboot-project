package pers.sjh.springboot.service.system.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.sjh.springboot.domain.common.tree.AreaTree;
import pers.sjh.springboot.domain.system.Area;
import pers.sjh.springboot.mapper.system.AreaMapper;
import pers.sjh.springboot.service.system.AreaService;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-21 13:06
 */

@Service("areaService")
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    @Override
    public List<AreaTree> getAreaTree(BigInteger parentId) {
        List<Area> areaList = areaMapper.findByParentId(parentId);
        List<AreaTree> areaTreeList = new ArrayList<>();
        AreaTree areaTree = null;
        for(Area area :areaList){
            areaTree = new AreaTree();
            areaTree.setId(area.getId());
            areaTree.setLabel(area.getAreaName());
            areaTree.setLeaf(area.getLeaf());
            areaTreeList.add(areaTree);
        }
        return areaTreeList;
    }
}
