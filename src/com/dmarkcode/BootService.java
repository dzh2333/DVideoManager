package com.dmarkcode;

import com.dmarkcode.entity.VideoBean;
import com.dmarkcode.util.VideoFilterHelper;

import java.util.List;

/**
 * 启动的主程序
 * @author DMark
 */
public class BootService {

    /**
     * 初始化工作
     * 工作步骤：
     * 1、读取保存的文件数据
     * 2、刷新数据（重新遍历）
     *
     * 数据搜索使用哈希算法
     */
    public static void mainInit(){
//        List<VideoBean> videoBeanList = VideoFilterHelper.getAllVideo("J:\\");
//        List<VideoBean> videoBeanList = VideoFilterHelper.videoFilterForFormat("J:\\", ".mp4");
        List<VideoBean> videoBeanList = VideoFilterHelper.videoFilterForName("J:\\", "GVG");
    }


    public static void main(String[] args){
        mainInit();
    }

}
