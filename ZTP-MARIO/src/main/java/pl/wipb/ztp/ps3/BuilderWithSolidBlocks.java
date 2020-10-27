package pl.wipb.ztp.ps3;

import java.util.List;

public class BuilderWithSolidBlocks implements Builder
{
    @Override
    public void createSegment_A(int x, int y)
    {
        Segment s = new SegmentBlock(x,y,"block1.png");
        map.add(s);
    }

    @Override
    public void createSegment_B(int x, int y)
    {
        Segment s = new SegmentBlockV(x,y,"block2.png");
        map.add(s);
    }

    @Override
    public void createSegment_C(int x, int y)
    {
        Segment s = new SegmentBlock(x,y,"block3.png");
        map.add(s);
    }

    @Override
    public void createSegment_G(int x, int y)
    {
        Segment s = new SegmentAnim(x,y,"bonus.png",new int[] {0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 2, 2, 1, 1, 1, 0, 0});
        map.add(s);
    }

    @Override
    public List<Segment> getMap()
    {
        return map;
    }
}
