package com.dmarkcode.util;

import com.dmarkcode.entity.VideoBean;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VideoFilterHelper {

    public static String[] exampleAimVideoFilter = {"ipx", "ipz", "ssni", "gvg"};

    public static String[] videoFormat = {".mp4", ".avi", ".wmv", ".mpeg", ".mpg", ".flv", ".swf"};

    /**
     * 获得该文件下的所有视频文件信息
     * @param sourcePath
     * @return
     */
    public static List<VideoBean> getAllVideo(String sourcePath){
        List<VideoBean> res = new ArrayList<>();

        File file = new File(sourcePath);
        if (!file.exists()){
            LogUtils.d("文件" + sourcePath + "不存在");
            return null;
        }
        List<File> files = FileUtils.readFile(sourcePath);
        for (int i = 0; i < files.size(); i++){
            File tmpFile = files.get(i);
            LogUtils.d("文件信息获得" + tmpFile.toString() + "文件大小 " + tmpFile.length()/1024/1024 + "MB");
        }

        return res;
    }

    public static List<VideoBean> videoFilterForName(String sourcePath, String name){
        List<VideoBean> res = new ArrayList<>();

        File file = new File(sourcePath);
        if (!file.exists()){
            LogUtils.d("文件" + sourcePath + "不存在");
            return null;
        }
        List<File> files = FileUtils.readFile(sourcePath);
        LogUtils.d("获得了文件数量为" + files.size());
        for (int i = 0; i < files.size(); i++){
            File tmpFile = files.get(i);

            if (tmpFile.getName().contains(name)){
                VideoBean videoBean = new VideoBean();
                videoBean.setFileName(tmpFile.getName());
                LogUtils.d("文件信息获得" + videoBean.toString());
            }
        }

        return res;
    }

    /**
     * 获得目录下指定的格式文件
     * @param sourcePath
     * @param format
     * @return
     */
    public static List<VideoBean> videoFilterForFormat(String sourcePath, String format){
        List<VideoBean> res = new ArrayList<>();

        File file = new File(sourcePath);
        if (!file.exists()){
            LogUtils.d("文件" + sourcePath + "不存在");
            return null;
        }
        List<File> files = FileUtils.readFile(sourcePath);
        for (int i = 0; i < files.size(); i++){
            File tmpFile = files.get(i);
            if (tmpFile.getName().contains(format)){
                VideoBean videoBean = new VideoBean();
                videoBean.setFileName(tmpFile.getName());
                LogUtils.d("文件信息获得" + videoBean.toString());
            }
        }

        return res;
    }

}
