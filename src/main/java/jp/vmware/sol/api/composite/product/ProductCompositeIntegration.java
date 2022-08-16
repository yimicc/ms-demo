package jp.vmware.sol.api.composite.product;

import jp.vmware.sol.api.core.product.Product;
import jp.vmware.sol.api.core.recommendation.Recommendation;
import jp.vmware.sol.api.core.review.Review;

import java.util.List;

public interface ProductCompositeIntegration {

    Product getProduct(int productId);

    List<Recommendation> getRecommendations(int productId);

    List<Review> getReviews(int productId);
}
