package sn.fatou.parking.repository.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import sn.fatou.parking.domain.User;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, String> {}
