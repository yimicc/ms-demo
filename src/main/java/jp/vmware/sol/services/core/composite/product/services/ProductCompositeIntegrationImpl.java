package jp.vmware.sol.services.core.composite.product.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import jp.vmware.sol.api.composite.product.ProductCompositeIntegration;
import jp.vmware.sol.api.core.product.Product;
import jp.vmware.sol.api.core.product.ProductService;
import jp.vmware.sol.api.core.recommendation.Recommendation;
import jp.vmware.sol.api.core.recommendation.RecommendationService;
import jp.vmware.sol.api.core.review.Review;
import jp.vmware.sol.api.core.review.ReviewService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductCompositeIntegrationImpl implements ProductCompositeIntegration {
    private static final Logger LOG = LoggerFactory.getLogger(ProductCompositeIntegrationImpl.class);
    private final ObjectMapper mapper;

    private ProductService productService;
    private RecommendationService recommendationService;
    private ReviewService reviewService;

    @Autowired
    public ProductCompositeIntegrationImpl(
        ObjectMapper mapper,
        ProductService productService,
        RecommendationService recommendationService,
        ReviewService reviewService)
    {
        this.mapper = mapper;
        this.productService = productService;
        this.recommendationService = recommendationService;
        this.reviewService = reviewService;
    }

    @Override
    public Product getProduct(int productId) {
        LOG.debug("Will call getProduct API on ProductService");

        Product product = productService.getProduct(productId);
        LOG.debug("Found a product with id: {}", product.getProductId());

        return product;
    }

    @Override
    public List<Recommendation> getRecommendations(int productId) {
        LOG.debug("Will call getRecommendations API on RecommendationService");
        List<Recommendation> recommendations = recommendationService.getRecommendations(productId);

        LOG.debug("Found {} recommendations for a product with id: {}", recommendations.size(), productId);
        return recommendations;
    }

    @Override
    public List<Review> getReviews(int productId) {
        LOG.debug("Will call get Reviews API on ReviewService");
        List<Review> reviews = reviewService.getReviews(productId);

        LOG.debug("Found {} reviews for a product with id: {}", reviews.size(), productId);
        return reviews;
    }
}
