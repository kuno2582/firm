package com.design.adapter;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "��𿡵�.mp3");
		audioPlayer.play("mp4", "�״��� ��ġ.mp4");
		audioPlayer.play("vlc", "���ϸ���.vlc");
		audioPlayer.play("avi", "�߱�������.avi");
	}
}
