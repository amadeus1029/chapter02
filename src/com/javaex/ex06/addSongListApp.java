package com.javaex.ex06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class addSongListApp {
    public static void main(String[] args) {
        Scanner addSongs = new Scanner(System.in);
        Song[] songsArray = new Song[1]; // 입력받을 배열 생성
        boolean programWork = true;
        String title, artist, album, composer;
        int year, track;

        for(int i=0;programWork;) {
            try {
                System.out.println("메뉴를 선택해주세요");
                System.out.println("1.음악 추가\t2.음악 리스트\t3.종료하기");
                System.out.print("메뉴>> ");
                int menu = addSongs.nextInt();
                switch (menu) {
                    case 1 :
                        if(i!=0) { //처음 상품 추가 이외에는 추가하기 전에 배열의 길이부터 늘려야함
                            Song[] tempSongsArray = new Song[songsArray.length+1]; //지금까지 입력한 배열보다 하나 더 긴 배열 생성
                            for(int j=0;j<songsArray.length;j++) { //새로 생성한 배열에 기존 배열 복사
                                tempSongsArray[j] = songsArray[j];
                            }
                            songsArray = tempSongsArray; //배열 바꿔치기
                        }
                        songsArray[i] = new Song(); //메모리에 올림

                        System.out.print("제목: ");
                        title = addSongs.next();
                        songsArray[i].setTitle(title);

                        System.out.print("가수: ");
                        artist = addSongs.next();
                        songsArray[i].setArtist(artist);

                        System.out.print("앨범: ");
                        album = addSongs.next();
                        songsArray[i].setAlbum(album);

                        System.out.print("작곡가: ");
                        composer = addSongs.next();
                        songsArray[i].setComposer(composer);
                        
                        System.out.print("년도: ");
                        year = addSongs.nextInt();
                        songsArray[i].setYear(year);

                        System.out.print("트랙번호: ");
                        track = addSongs.nextInt();
                        songsArray[i].setTrack(track);

                        i++;
                        break;
                    case 2 :
                        if(songsArray[0] == null) {
                            System.out.println("등록하신 노래가 존재하지 않습니다");
                        } else {
                            System.out.println("등록하신 노래의 목록은 총 "+songsArray.length+"개이며");
                            for(int j=0;j<songsArray.length;j++) {
                                System.out.print((j+1)+". ");
                                songsArray[j].showInfo();
                            }
                        }
                        break;
                    case 3 :
                        System.out.println("노래 등록을 종료합니다");
                        programWork = false;
                        break;
                    default :
                        System.out.println("잘못 입력하셨습니다, 다시 입력해주세요");
                }
            } catch(InputMismatchException ime) {
                System.out.println("잘못 입력하셨습니다, 다시 입력해주세요");
                addSongs = new Scanner(System.in);
            }

        }
        addSongs.close();
    }
}
