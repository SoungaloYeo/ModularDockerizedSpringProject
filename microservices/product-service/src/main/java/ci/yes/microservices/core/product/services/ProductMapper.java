package ci.yes.microservices.core.product.services;

import ci.yes.api.core.product.Product;
import ci.yes.microservices.core.product.persistence.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {


  @Mapping(target = "serviceAddress", ignore = true)
  Product entityToApi(ProductEntity entity);


  @Mapping(target = "id", ignore = true)
  @Mapping(target = "version", ignore = true)
  ProductEntity apiToEntity(Product api);
}
