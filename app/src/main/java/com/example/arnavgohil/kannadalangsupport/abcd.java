package com.example.arnavgohil.kannadalangsupport;

public class abcd {
    private String kann,engg;
    private int imgRes,audRes;

    public abcd(String kanntrans,String enggword,int imageResource,int audioResource)
    {
        audRes=audioResource;
        imgRes=imageResource;
        kann=kanntrans;
        engg=enggword;
    }

    public int getAudRes()  {return audRes;}
    public int getImgRes()  {return imgRes;}
    public String getKann() {
        return kann;
    }
    public String getEngg() {
        return engg;
    }
}
