package org.example.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.example.dao.FileTestDAO;

import java.io.File;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileDataAction extends ActionSupport {

    private File uploadedFile;
    private String uploadedFileContentType;
    private String uploadedFileFileName;
    private String localDirectory = "C:\\temp";

    @Override
    public String execute() throws Exception {
        File localFile = new File(localDirectory, uploadedFileFileName);
        FileUtils.copyFile(uploadedFile, localFile);
        System.out.println(localFile.getAbsolutePath());
        String filePath = localFile.getAbsolutePath();
        int id = FileTestDAO.saveFilePath(filePath);
        return SUCCESS;
    }

    public Set<String> getFileList() {
        return Stream.of(Objects.requireNonNull(new File(localDirectory).listFiles()))
                .filter(file -> !file.isDirectory())
                .map(File::getName)
                .collect(Collectors.toSet());
    }

    public File getUploadedFile() {
        return uploadedFile;
    }

    public void setUploadedFile(File uploadedFile) {
        this.uploadedFile = uploadedFile;
    }

    public String getUploadedFileFileName() {
        return uploadedFileFileName;
    }

    public void setUploadedFileFileName(String uploadedFileFileName) {
        this.uploadedFileFileName = uploadedFileFileName;
    }

    public String getUploadedFileContentType() {
        return uploadedFileContentType;
    }

    public void setUploadedFileContentType(String uploadedFileContentType) {
        this.uploadedFileContentType = uploadedFileContentType;
    }
}
