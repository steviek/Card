package com.sixbynine.card.model;

import com.sixbynine.card.R;

/**
 * Created by steviekideckel on 10/26/14.
 */
public enum SocialNetwork {
    TELEPHONY(0, "telephony",0, 0,0,0,R.string.telephony, false),
    FACEBOOK(1, "facebook",
            R.drawable.icon_fb_small,
            R.drawable.icon_fb_medium,
            R.drawable.icon_fb_large,
            R.drawable.icon_fb_huge,
            R.string.facebook, false),
    LINKEDIN(2, "linkedin",
            R.drawable.icon_linkedin_small,
            R.drawable.icon_linkedin_medium,
            R.drawable.icon_linkedin_large,
            R.drawable.icon_linkedin_huge,
            R.string.linkedin, false),
    SNAPCHAT(3, "snapchat",
            R.drawable.icon_snapchat_small,
            R.drawable.icon_snapchat_medium,
            R.drawable.icon_snapchat_large,
            R.drawable.icon_snapchat_huge,
            R.string.snapchat, true);
    /*INSTAGRAM(4, "instagram", R.drawable.icon_instagram, R.string.instagram, true),
    TWITTER(5, "twitter", R.drawable.icon_twitter, R.string.twitter, true);*/


    String key;
    int id;
    int logoHuge;
    int logoLarge;
    int logoMedium;
    int logoSmall;
    int name;
    boolean atInHandle;


    SocialNetwork(int id, String key, int logoSmall, int logoMedium, int logoLarge, int logoHuge, int name, boolean atInHandle){
        this.id = id;
        this.key = key;
        this.logoSmall = logoSmall;
        this.logoMedium = logoMedium;
        this.logoLarge = logoLarge;
        this.logoHuge = logoHuge;
        this.name = name;
        this.atInHandle = atInHandle;
    }

    public String getKey(){
        return key;
    }

    public int getId(){
        return id;
    }

    public int getLogo(LogoSize size){
        switch(size){
            case MEDIUM:
                return logoMedium;
            case LARGE:
                return logoLarge;
            case HUGE:
                return logoHuge;
            case SMALL:
            default:
                return logoSmall;
        }
    }



    public int getName(){
        return name;
    }

    public boolean hasAtInHandle(){
        return atInHandle;
    }

    public static SocialNetwork fromId(int id){
        for(SocialNetwork network : SocialNetwork.values()){
            if(network.id == id){
                return network;
            }
        }
        return null;
    }

}
