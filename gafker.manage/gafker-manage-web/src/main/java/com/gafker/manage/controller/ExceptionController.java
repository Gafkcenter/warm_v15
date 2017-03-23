package com.gafker.manage.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.gafker.common.exception.DestImagePathException;
import com.gafker.common.exception.ImagePathException;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(Exception.class)
	public ModelAndView handlerExceptionResponse(Exception ex){
		ModelAndView mv = new ModelAndView("error/duplicate");
		mv.addObject("message", "祝福热真诚，就热感动人</br>您的祝福信息不全！<br/>");
		mv.addObject("errors", ex.getStackTrace());
		mv.addObject("messageTitle", ex.getMessage());
		return mv ;
	}
	@ExceptionHandler(ImagePathException.class)
	public ModelAndView handlerExceptionResponse(ImagePathException ex){
		ModelAndView mv = new ModelAndView("error/duplicate");
		mv.addObject("message", "祝福热真诚，就热感动人</br>您的祝福信息不全！<br/>");
		mv.addObject("errors", ex.getStackTrace());
		mv.addObject("messageTitle", ex.getErrors().getValue()+ex.getStringMessage());
		return mv ;
	}
	@ExceptionHandler(DestImagePathException.class)
	public ModelAndView handlerExceptionResponse(DestImagePathException ex){
		ModelAndView mv = new ModelAndView("error/duplicate");
		mv.addObject("message", "祝福热真诚，就热感动人</br>您的祝福信息不全！<br/>");
		mv.addObject("errors", ex.getStackTrace());
		mv.addObject("messageTitle", ex.getErrors().getValue()+ex.getStringMessage());
		return mv ;
	}
}
