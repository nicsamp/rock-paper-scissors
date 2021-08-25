package br.com.bradescoseguros.api;

import br.com.bradescoseguros.model.HomeInsuranceProduct;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ProductApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-24T20:45:55.771840-03:00[America/Recife]")

public interface ProductApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /product/{productname} : Get home-insurance-product by home-insurance-product name
     *
     * @param productname The name that needs to be fetched. Use product1 for testing.  (required)
     * @return successful operation (status code 200)
     *         or Product not found (status code 404)
     * @see ProductApi#getProductByName
     */
    default ResponseEntity<HomeInsuranceProduct> getProductByName(String productname) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"productname\" : \"productname\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
