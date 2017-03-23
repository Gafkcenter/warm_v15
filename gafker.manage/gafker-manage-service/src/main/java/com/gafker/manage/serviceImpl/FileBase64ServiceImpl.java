package com.gafker.manage.serviceImpl;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.gafker.manage.pojo.response.FileBase64InfoResponse;
import com.gafker.manage.service.FileBase64Service;
import com.gafker.manage.service.utils.FileUtils;

@Service
public class FileBase64ServiceImpl implements FileBase64Service {
	private static final Logger logger1 = LogManager.getLogger(FileBase64ServiceImpl.class);
	@Value("${upload.file.path.root}")
	private String recordRoot;

	@Override
	public FileBase64InfoResponse saveBase64File(String baseData) throws Exception, IOException {
		FileBase64InfoResponse response=new FileBase64InfoResponse();
		if(null!=baseData&&!baseData.equals("".trim())){
			String imageName = FileUtils.saveBase64Img(baseData, recordRoot);
			response.setWarmfile(imageName);
			response.setBase64img(baseData);
		}
		return response;
	}

}
