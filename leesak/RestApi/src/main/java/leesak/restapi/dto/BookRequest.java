package leesak.restapi.dto;

import lombok.Getter;

@Getter
public class BookRequest {
    private String name;
    private Integer price;
    private String category;
}
