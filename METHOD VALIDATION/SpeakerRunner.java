class SpeakerRunner{
	public static void main(String audio[]){
	System.out.println("MAIN STARTED");
	Speaker.onOrOff();
	Speaker.increaseVolume();
	Speaker.increaseVolume();
	Speaker.increaseVolume();
	Speaker.increaseVolume();
	Speaker.onOrOff();
	Speaker.decreaseVolume();
	Speaker.decreaseVolume();
	Speaker.decreaseVolume();
	Speaker.onOrOff();
	Speaker.increaseVolume();
	Speaker.decreaseVolume();
	Speaker.decreaseVolume();
	System.out.println("MAIN ENDED");
}
}