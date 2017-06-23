package com.gafker.manage.vo;

public class FileResponse {
	// 上传的原始文件名xxx.jpg
	private String fileOriginalFilename;
	// 上传的UUID新文件名d:/fileUpload/xxx.jpg,项目RealPath硬盘存放位置
	private String fileUUidFullName;
	// 上传后的新文件名，网络访问相对路径，包含项目名称/fileUpload/xxx.jpg
	private String fileUUidName;
	//没有上传文件使用默认图片
	private String sourceFilePath;

	// 文件保存状态
	private Boolean status;

	public String getFileOriginalFilename() {
		return fileOriginalFilename;
	}

	public void setFileOriginalFilename(String fileOriginalFilename) {
		this.fileOriginalFilename = fileOriginalFilename;
	}

	public String getFileUUidFullName() {
		return fileUUidFullName;
	}

	public void setFileUUidFullName(String fileUUidFullName) {
		this.fileUUidFullName = fileUUidFullName;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getFileUUidName() {
		return fileUUidName;
	}

	public void setFileUUidName(String fileUUidName) {
		this.fileUUidName = fileUUidName;
	}

	@Override
	public String toString() {
		return "FileResponse [fileOriginalFilename=" + fileOriginalFilename + ", fileUUidFullName=" + fileUUidFullName
				+ ", fileUUidName=" + fileUUidName + ", status=" + status + "]";
	}

	public String getSourceFilePath() {
		return sourceFilePath;
	}

	public void setSourceFilePath(String sourceFilePath) {
		this.sourceFilePath = sourceFilePath;
	}


}
