package AdilsonClaro.model;

import com.opencsv.bean.CsvBindByName;

import java.math.BigDecimal;

public class Produto {

    @CsvBindByName(column = "ProductId", required = true)
    private Long id;

    @CsvBindByName(column = "Price", required = true)
    private BigDecimal price;

    @CsvBindByName(column = "ProductName", required = true)
    private String name;

    @CsvBindByName(column = "Description", required = true)
    private String description;

    @CsvBindByName(column = "Category", required = true)
    private String category;

    public Produto(Long id, BigDecimal price, String name, String description, String category) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.description = description;
        this.category = category;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPreco(BigDecimal preco) {
        this.price = preco;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descricao) {
        this.description = descricao;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String categoria) {
        this.category = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
