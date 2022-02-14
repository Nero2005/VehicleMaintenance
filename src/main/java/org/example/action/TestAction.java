package org.example.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.File;

public class TestAction extends ActionSupport {

    private File localFile;
    private String localDirectory = "C:\\temp";

    @Override
    public String execute() throws Exception {

        return SUCCESS;
    }
}
