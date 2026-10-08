package leesak.restapi.dto;

import leesak.restapi.domain.Book;
import lombok.Getter;

@Getter
public class BookResponse {
    private final Long id;
    private final String name;
    private final Integer price;
    private final String category;

    public BookResponse(Book book) {
        this.id = book.getId();
        this.name = book.getName();
        this.price = book.getPrice();
        this.category = book.getCategory();
    }
}
