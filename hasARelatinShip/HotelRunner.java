class HotelRunner{


	public static void main(String taj[]){

	Hotel hotel = new Hotel();
	String hotelName="TAJ";
	hotel.hotelName=hotelName;
	hotel.ownerName ="BABA";
	hotel.noOfWorkers = 45;

	Floor floor = new Floor();
	hotel.floor = floor;
	floor.isWellDesigned = true;	
	
	Room room = new Room();
	floor.room = room;
	room.type="SUITE";
	room.bedType="KING SIZE";
	room.isAcAvailable=true;
	room.noOfWindows=4;

	
	hotel.getHotelInfo();
	}
}