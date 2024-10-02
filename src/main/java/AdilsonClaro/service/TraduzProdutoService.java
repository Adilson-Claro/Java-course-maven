package AdilsonClaro.service;

import AdilsonClaro.model.Produto;
import net.suuft.libretranslate.Language;
import net.suuft.libretranslate.Translator;

public class TraduzProdutoService {

    public void traduzir(Produto produto){
        var nome =Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getName());
        var categoria =Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getCategory());
        var descricao =Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getDescription());

        produto.setName(nome);
        produto.setCategory(categoria);
        produto.setDescription(descricao);
    }
}
