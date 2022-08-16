package jp.vmware.sol.api.core.review;

import java.util.List;

public interface ReviewService {

    List<Review> getReviews(int productId);
}
