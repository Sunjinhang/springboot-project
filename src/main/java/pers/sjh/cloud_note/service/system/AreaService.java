package pers.sjh.cloud_note.service.system;

import pers.sjh.cloud_note.domain.common.tree.AreaTree;

import java.math.BigInteger;
import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-21 13:06
 */
public interface AreaService {

    List<AreaTree> getAreaTree(BigInteger parentId);
}
