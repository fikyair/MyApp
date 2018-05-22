package com.jd.alpha.skill.client.entity.request;

import lombok.*;

/**
 * Skill Session 应用信息
 *
 * @author <b>作者：</b> D.Yang（cdyangyang18@jd.com） <br/>
 * <b>时间：</b> 2017/11/29 15:59 <br/>
 * <b>Copyright (c)</b> 2018 京东智能-版权所有 <br/>
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SkillSessionApplicationInfo {

    /**
     * App Id
     */
    private String applicationId;

}
