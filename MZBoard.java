package board.model.vo;

import java.sql.Date;

public class MZBoard {
	
	public int boardNo;
	public int boardType;
	public String boardTitle;
	public int restaurantNo;
	public String restaurantAddress;
	public String restaurantPhone;
	public String restaurantIntro;
	public String restaurantContent;
	public int foodNo;
	public String foodName;
	public String foodType;
	public String userId;
	public int boardCount;
	public int boardContent;
	public Date boardDate;
	public Date modifyDate;
	public String status;			// 
	
	public MZBoard() {}

	public MZBoard(int boardNo, int boardType, String boardTitle, int restaurantNo, int foodNo, String userId,
			int boardContent, Date boardDate, Date modifyDate, String status) {
		super();
		this.boardNo = boardNo;
		this.boardType = boardType;
		this.boardTitle = boardTitle;
		this.restaurantNo = restaurantNo;
		this.foodNo = foodNo;
		this.userId = userId;
		this.boardContent = boardContent;
		this.boardDate = boardDate;
		this.modifyDate = modifyDate;
		this.status = status;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public int getBoardType() {
		return boardType;
	}

	public void setBoardType(int boardType) {
		this.boardType = boardType;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public int getRestaurantNo() {
		return restaurantNo;
	}

	public void setRestaurantNo(int restaurantNo) {
		this.restaurantNo = restaurantNo;
	}

	public int getFoodNo() {
		return foodNo;
	}

	public void setFoodNo(int foodNo) {
		this.foodNo = foodNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(int boardContent) {
		this.boardContent = boardContent;
	}

	public Date getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "MZ [boardNo=" + boardNo + ", boardType=" + boardType + ", boardTitle=" + boardTitle + ", restaurantNo="
				+ restaurantNo + ", foodNo=" + foodNo + ", userId=" + userId + ", boardContent=" + boardContent
				+ ", boardDate=" + boardDate + ", modifyDate=" + modifyDate + ", status=" + status + "]";
	}
	
	

}
