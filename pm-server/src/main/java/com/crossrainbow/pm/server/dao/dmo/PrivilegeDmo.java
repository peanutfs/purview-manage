package com.crossrainbow.pm.server.dao.dmo;

import com.crossrainbow.pm.server.domain.entity.Privilege;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 17:08 2019/12/25
 */
@Getter
@Setter
@ToString
public class PrivilegeDmo extends Privilege {

    /**
     * 资源ID
     */
    private Long resourceId;
}
