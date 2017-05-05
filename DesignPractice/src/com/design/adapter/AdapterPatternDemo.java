package com.design.adapter;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "어디에도.mp3");
		audioPlayer.play("mp4", "그대라는 사치.mp4");
		audioPlayer.play("vlc", "에일리언.vlc");
		audioPlayer.play("avi", "야구동영상.avi");
	}
}
