package br.com.bradescoseguros.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HomeInsuranceProduct
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-24T20:45:55.771840-03:00[America/Recife]")

public class HomeInsuranceProduct   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("productname")
  private String productname;

  public HomeInsuranceProduct id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public HomeInsuranceProduct productname(String productname) {
    this.productname = productname;
    return this;
  }

  /**
   * Get productname
   * @return productname
  */
  @ApiModelProperty(value = "")


  public String getProductname() {
    return productname;
  }

  public void setProductname(String productname) {
    this.productname = productname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HomeInsuranceProduct homeInsuranceProduct = (HomeInsuranceProduct) o;
    return Objects.equals(this.id, homeInsuranceProduct.id) &&
        Objects.equals(this.productname, homeInsuranceProduct.productname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HomeInsuranceProduct {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productname: ").append(toIndentedString(productname)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

