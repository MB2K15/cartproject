package pl.mb2k15;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Matt on 2015-10-04.
 */
public interface ProductRepository extends CrudRepository <ProductModel , Integer > {


}
