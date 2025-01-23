package com.cjc.main.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponce {
private String message;
private String className;
private Date responceDate;
private int statusCode;

}
