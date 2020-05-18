package com.javaex.ex11;

public class TV {
    private int channel, volume;
    private boolean power;

    public TV(int channel, int volume, boolean power) {
        this.channel = channel;
        this.volume = volume;
        this.power = power;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isPower() {
        return power;
    }

    public void power(boolean power) {
        if(power) {
            this.power = true;
            System.out.println("TV를 켰습니다");
        } else {
            this.power = false;
            System.out.println("TV를 껐습니다");
        }
    }

    public void volume(int volume) {
        if(volume>=0&&volume<=100) {
            this.volume = volume;
        } else {
            System.out.println("음량 조절에 실패했습니다");
        }
    }
    public void volume(boolean volume) {
        if(volume) {
            volume(this.volume+1);
            System.out.println("음량 증가");
        } else {
            volume(this.volume-1);
            System.out.println("음량 감소");
        }
    }

    public void channel(int channel) {
        if(channel>=1&&channel<=255) {
            this.channel = channel;
        } else {
            System.out.println("존재하지 않는 채널입니다");
        }
    }
    public void channel(boolean channel) {
        if(channel) {
            channel(this.channel+1);
            System.out.println("채널 위로 이동");
        } else {
            channel(this.channel-1);
            System.out.println("채널 아래로 이동");
        }
    }

    public void status() {
        System.out.println(
                "전원:"+this.isPower()+
                ", 채널:"+this.getChannel()+
                ", 볼륨:"+this.getVolume()
        );
    }

    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", power=" + power +
                '}';
    }
}
