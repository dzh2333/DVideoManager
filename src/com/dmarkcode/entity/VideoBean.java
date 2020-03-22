package com.dmarkcode.entity;

/**
 * 影片的属性
 */
public class VideoBean {

	public VideoBean(){

	}

	public VideoBean(String fileName, String absolutePath, String desc, String mark, long fileSize, String author, String formatType, long videoTime, String posterPath, String sharpness, CategoryBean categoryBean, int likeStar) {
		this.fileName = fileName;
		this.absolutePath = absolutePath;
		this.desc = desc;
		this.mark = mark;
		this.fileSize = fileSize;
		this.author = author;
		this.formatType = formatType;
		this.videoTime = videoTime;
		this.posterPath = posterPath;
		this.sharpness = sharpness;
		this.categoryBean = categoryBean;
		this.likeStar = likeStar;
	}

	@Override
	public String toString() {
		return "VideoBean{" +
				"fileName='" + fileName + '\'' +
				", absolutePath='" + absolutePath + '\'' +
				", desc='" + desc + '\'' +
				", mark='" + mark + '\'' +
				", fileSize=" + fileSize +
				", author='" + author + '\'' +
				", formatType='" + formatType + '\'' +
				", videoTime=" + videoTime +
				", posterPath='" + posterPath + '\'' +
				", sharpness='" + sharpness + '\'' +
				", categoryBean=" + categoryBean +
				", likeStar=" + likeStar +
				'}';
	}

	private String fileName;
	private String absolutePath;
	private String desc;
	private String mark;
	private long fileSize;
	private String author;
	private String formatType;
	private long videoTime;
	private String posterPath;
	//清晰度
	private String sharpness;
	private CategoryBean categoryBean;
	private int likeStar;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getAbsolutePath() {
		return absolutePath;
	}

	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getFormatType() {
		return formatType;
	}

	public void setFormatType(String formatType) {
		this.formatType = formatType;
	}

	public long getVideoTime() {
		return videoTime;
	}

	public void setVideoTime(long videoTime) {
		this.videoTime = videoTime;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}

	public String getSharpness() {
		return sharpness;
	}

	public void setSharpness(String sharpness) {
		this.sharpness = sharpness;
	}

	public CategoryBean getCategoryBean() {
		return categoryBean;
	}

	public void setCategoryBean(CategoryBean categoryBean) {
		this.categoryBean = categoryBean;
	}

	public int getLikeStar() {
		return likeStar;
	}

	public void setLikeStar(int likeStar) {
		this.likeStar = likeStar;
	}
}
