package br.com.bradescoseguros;

import br.com.bradescoseguros.api.ProductApiDelegate;
import br.com.bradescoseguros.model.HomeInsuranceProduct;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductApiDelegateImpl implements ProductApiDelegate {

    @Override
    public ResponseEntity<HomeInsuranceProduct> getProductByName(String input) {
        HomeInsuranceProduct product = new HomeInsuranceProduct();

        product.setId(123L);

        int myInt = 11;

        product.setProductname ("hello world "+myInt+" "+input);

        return ResponseEntity.ok(product);
    }
}
