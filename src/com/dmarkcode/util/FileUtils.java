package com.dmarkcode.util;

import sun.rmi.server.LoaderHandler;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {


    private static int count = 0;
    private static List<File> fileList = new ArrayList<File>();

    /**
     * 获得本地文件夹下的文件
     * @param fileDir
     * @return
     */
    public static List<File> readFile(String fileDir) {
        File file = new File(fileDir);
        if (file.getName().equals("宣傳文件") || file.getName().equals("2048")){
            LogUtils.d("删除了" + file.getAbsolutePath());
            deleteFile(file);
            return null;
        }
        File[] files = file.listFiles();// 获取目录下的所有文件或文件夹
        if (files == null) {// 如果目录为空，直接退出
            return null;
        }

        // 遍历，目录下的所有文件
        for (File f : files) {
            count ++;
//            LogUtils.d("文件数" + count + "名称" + f.getName());
            if (f.isFile()) {
                fileList.add(f);
            } else if (f.isDirectory()) {
                readFile(f.getAbsolutePath());
            }
        }
        return fileList;
    }

    public static boolean deleteFile(File file){
        if (!file.exists()){
            return false;
        }
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File f : files) {
                deleteFile(f);
                }
            }
        return file.delete();
    }


}
