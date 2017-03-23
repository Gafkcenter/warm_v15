package com.gafker.manage.service;

import com.gafker.manage.pojo.response.FileBase64InfoResponse;

public interface FileBase64Service {

	public FileBase64InfoResponse saveBase64File(String baseData) throws Exception;

}
