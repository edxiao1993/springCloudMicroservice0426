package org.kevin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Kevin.Z
 * @version 2021/6/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ParameterParser {
    private Integer pageNum;
    private Integer pageSize;
    private Integer limit;

    private String moment;

    private Integer articleType;

    public ParameterParser(Integer pageNum, Integer pageSize){
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }
}
