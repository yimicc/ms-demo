package jp.vmware.sol.api.core.recommendation;

import java.util.List;

public interface RecommendationService {

    List<Recommendation> getRecommendations(int productId);
}
