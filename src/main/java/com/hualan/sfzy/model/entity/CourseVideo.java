package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 课程视频表
public class CourseVideo {
    private Integer id;
    private String videoName;
    private Long videoTime;
    private String videoUrl;
    private Integer courseId;
    private Integer del;
}
