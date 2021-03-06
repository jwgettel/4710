package Models.Review;

import java.sql.ResultSet;
import java.sql.SQLException;
import Models.Review.Review;
import Dao.Dao;
import Dao.IMapper;

public class ReviewDao extends Dao<Review, String> {

	private static IMapper<Review> WRITES_MAPPER = new IMapper<Review>(){
		@Override
		public Review map(ResultSet resultSet) throws SQLException{
			Review review = new Review();
						
			review.setId(resultSet.getInt("reviewid"));
			review.setSubDate(resultSet.getDate("subdate"));
			review.setComment(resultSet.getString("comment"));
			review.setRecommend(resultSet.getBoolean("recommend"));
			review.setPaperID(resultSet.getInt("paperid"));
			review.setPCMemberId(resultSet.getInt("pcmemberid"));
			
			return review;			
		}
	};
	
	
	public ReviewDao() {
		super(WRITES_MAPPER, Review.class);
	}	
	
}
