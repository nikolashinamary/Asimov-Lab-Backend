package com.example.demo.payload.response;

public class FileResponse {
    private String file;

    public FileResponse(String file){
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
