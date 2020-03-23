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
    public synchronized static List<VideoBean> getAllVideo(String sourcePath){
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

    public synchronized static List<VideoBean> videoFilterForName(String sourcePath, String name){
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
    public synchronized static List<VideoBean> videoFilterForFormat(String sourcePath, String format){
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
            if (tmpFile.getName().contains(format)){
                VideoBean videoBean = new VideoBean();
                videoBean.setFileName(tmpFile.getName());
                LogUtils.d("文件信息获得" + videoBean.toString());
            }
        }

        return res;
    }

    /**
     * 清楚所有种子
     */
    public synchronized static void cleanAllSpeed(String sourcePath){
        File file = new File(sourcePath);
        if (!file.exists()){
            LogUtils.d("文件" + sourcePath + "不存在");
            return;
        }
        List<File> files = FileUtils.readFile(sourcePath);
        LogUtils.d("获得了文件数量为" + files.size());
        for (int i = 0; i < files.size(); i++){
            File tmpFile = files.get(i);
            if (tmpFile.getName().contains(".torrent")){
                tmpFile.delete();
                LogUtils.d("清楚了垃圾" + tmpFile.getName());
            }
        }
    }

    /**
     * 清除广告垃圾
     * @param path
     */
    public synchronized static void cleanAllAdRuddish(String path){
        File file = new File(path);
        if (!file.exists()){
            LogUtils.d("文件" + path + "不存在");
            return;
        }
        List<File> files = FileUtils.readFile(path);
        LogUtils.d("获得了文件数量为" + files.size());
        for (int i = 0; i < files.size(); i++){
            File tmpFile = files.get(i);
            for (int j = 0; j < CleanHelper.rubbish.length; j++){
                if (tmpFile.getName().equals(CleanHelper.rubbish[j])){
                    tmpFile.delete();
                    LogUtils.d("清除了指定文件" + tmpFile.getName() + "路径为" + tmpFile.getAbsolutePath());
                }
            }
        }
    }

    public synchronized static void cleanTargetNameInPath(String path, String targetNameFile){
        File file = new File(path);
        if (!file.exists()){
            LogUtils.d("文件" + path + "不存在");
            return;
        }
        List<File> files = FileUtils.readFile(path);
        LogUtils.d("获得了文件数量为" + files.size());
        for (int i = 0; i < files.size(); i++){
            File tmpFile = files.get(i);
            if (tmpFile.getName().equals(targetNameFile)){
                tmpFile.delete();
                LogUtils.d("清除了指定文件" + tmpFile.getName() + "路径为" + tmpFile.getAbsolutePath());
            }
        }
    }

    /**
     * 清理迅雷失效文件（未下完，不想下的垃圾）
     */
    public static void cleanXunLeiFailedRes(String path){
        File file = new File(path);
        if (!file.exists()){
            LogUtils.d("文件" + path + "不存在");
            return;
        }
        List<File> files = FileUtils.readFile(path);
        LogUtils.d("获得了文件数量为" + files.size());
        for (int i = 0; i < files.size(); i++){
            File tmpFile = files.get(i);
            if (tmpFile.getName().contains(".bt.xltd")){
                tmpFile.delete();
                LogUtils.d("清除了指定文件" + tmpFile.getName() + "路径为" + tmpFile.getAbsolutePath());
            }
        }
    }

}
