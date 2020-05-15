package com.javaex.ex11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Remote {
    public static void main(String[] args) {
        TV tv = new TV(7, 20, false);
        Scanner remoteController = new Scanner(System.in);
        boolean tvPower = false;
        do {
            try {
                System.out.println("----------------------------");
                System.out.println("   1.전원 2.채널 3.볼륨 4.상태   ");
                System.out.println("----------------------------");
                System.out.println("메뉴를 선택해주세요");
                System.out.print(">> ");
                int menu = remoteController.nextInt();
                switch (menu) {
                    case 1 :
                        if(tvPower) {
                            tv.power(false);
                            tvPower = false;
                        } else {
                            tv.power(true);
                            tvPower = true;
                        }
                        break;
                    case 2 :
                        do {
                            try {
                                System.out.println("채널 조절을 위해 +,- 혹은 숫자를 입력해주세요");
                                System.out.print("채널>> ");
                                String channel = remoteController.next();
                                if(channel.equals("+")) {
                                    tv.channel(true);
                                } else if(channel.equals("-")) {
                                    tv.channel(false);
                                } else {
                                    tv.channel(Integer.parseInt(channel));
                                }
                                break;
                            } catch(NumberFormatException e) {
                                System.out.println("채널을 잘못 입력하셨습니다");
                                remoteController = new Scanner(System.in);
                            }
                        }while(true);
                        break;
                    case 3 :
                        do {
                            try {
                                System.out.println("볼륨 조절을 위해 +,- 혹은 숫자를 입력해주세요");
                                System.out.print("볼륨>> ");
                                String volume = remoteController.next();
                                if(volume == "+") {
                                    tv.volume(true);
                                } else if(volume == "-") {
                                    tv.volume(false);
                                } else {
                                    tv.volume(Integer.parseInt(volume));
                                }
                                break;
                            } catch(NumberFormatException e) {
                                System.out.println("볼륨을 잘못 입력하셨습니다");
                                remoteController = new Scanner(System.in);
                            }
                        }while(true);
                        break;
                    case 4 :
                        tv.status();
                        break;
                    default:
                        System.out.println("잘못 입력하셨습니다, 다시 입력해주세요");
                }
            } catch(InputMismatchException ime) {
                System.out.println("잘못 입력하셨습니다, 다시 입력해주세요");
                remoteController = new Scanner(System.in);
            }
        }while(true);
    }
}
