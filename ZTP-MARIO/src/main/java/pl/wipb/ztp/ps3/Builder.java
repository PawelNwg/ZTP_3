package pl.wipb.ztp.ps3;

import java.util.ArrayList;
import java.util.List;

public interface Builder
{
    List<Segment> map = new ArrayList<>();

    void createSegment_A(int x,int y);

    void createSegment_B(int x,int y);

    void createSegment_C(int x,int y);

    void createSegment_G(int x,int y);

    List<Segment> getMap();

}
