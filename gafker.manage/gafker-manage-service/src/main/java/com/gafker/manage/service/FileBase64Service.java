package com.gafker.manage.service;

import com.gafker.manage.vo.FileBase64InfoResponse;

public interface FileBase64Service {

	public FileBase64InfoResponse saveBase64File(String baseData) throws Exception;

}
