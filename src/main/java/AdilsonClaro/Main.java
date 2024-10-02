package AdilsonClaro;


import AdilsonClaro.model.Produto;
import AdilsonClaro.service.TraduzProdutoService;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        TraduzProdutoService traduzService = new TraduzProdutoService();

        List<Produto> produtos = new CsvToBeanBuilder(new FileReader("src/main/resources/products.csv"))
                .withType(Produto.class).build().parse();

        for (Produto produto: produtos){
            System.out.println(produto);
        }

        for (Produto produto: produtos){
            traduzService.traduzir(produto);
            System.out.println(produto);
        }
    }
}