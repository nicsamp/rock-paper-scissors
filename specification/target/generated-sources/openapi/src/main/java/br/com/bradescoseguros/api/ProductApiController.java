package br.com.bradescoseguros.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-24T20:45:55.771840-03:00[America/Recife]")

@Controller
@RequestMapping("${openapi.aPIsOpenDataDoOpenInsuranceBrasil.base-path:/open-insurance/products-services/v1}")
public class ProductApiController implements ProductApi {

    private final ProductApiDelegate delegate;

    public ProductApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ProductApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ProductApiDelegate() {});
    }

    @Override
    public ProductApiDelegate getDelegate() {
        return delegate;
    }

}
