package com.example.demo.payload.response;

import com.example.demo.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookResponse {
    private List<String> headings;

    public BookResponse(List<Book> list){
        headings = new ArrayList<>();
        for (Book elem: list){
            headings.add(elem.getHeading());
        }
    }



    public List<String> getHeadings() {
        return headings;
    }

    public void setHeading(List<String> heading) {
        this.headings = heading;
    }

}
