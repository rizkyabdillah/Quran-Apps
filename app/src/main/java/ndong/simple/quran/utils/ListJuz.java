package ndong.simple.quran.utils;

import java.util.ArrayList;
import java.util.List;
import ndong.simple.quran.model.ListSurahInJuz;

public class ListJuz {
    private final List<ListSurahInJuz[]> list = new ArrayList<>();

    public ListJuz() {
        // JUZ 1
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(1).build(),
                new ListSurahInJuz.Builder(2).setNomorStop(141).build()
        });
        //JUZ 2
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(2).setNomorStart(142).setNomorStop(252).build()
        });
        //JUZ 3
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(2).setNomorStart(253).build(),
                new ListSurahInJuz.Builder(3).setNomorStop(91).build()
        });
        //JUZ 4
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(3).setNomorStart(92).build(),
                new ListSurahInJuz.Builder(4).setNomorStop(23).build()
        });
        //JUZ 5
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(4).setNomorStart(24).setNomorStop(147).build()
        });
        //JUZ 6
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(4).setNomorStart(148).build(),
                new ListSurahInJuz.Builder(5).setNomorStop(82).build()
        });
        //JUZ 7
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(5).setNomorStart(83).build(),
                new ListSurahInJuz.Builder(6).setNomorStop(110).build()
        });
        //JUZ 8
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(6).setNomorStart(111).build(),
                new ListSurahInJuz.Builder(7).setNomorStop(87).build()
        });
        //JUZ 9
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(7).setNomorStart(88).build(),
                new ListSurahInJuz.Builder(8).setNomorStop(40).build()
        });
        //JUZ 10
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(8).setNomorStart(41).build(),
                new ListSurahInJuz.Builder(9).setNomorStop(93).build()
        });
        //JUZ 11
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(9).setNomorStart(94).build(),
                new ListSurahInJuz.Builder(10).build(),
                new ListSurahInJuz.Builder(11).setNomorStop(5).build(),
        });
        //JUZ 12
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(11).setNomorStart(6).build(),
                new ListSurahInJuz.Builder(12).setNomorStop(52).build(),
        });
        //JUZ 13
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(12).setNomorStart(53).build(),
                new ListSurahInJuz.Builder(13).build(),
                new ListSurahInJuz.Builder(14).build(),
                new ListSurahInJuz.Builder(15).setNomorStop(1).build(),
        });
        //JUZ 14
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(15).setNomorStart(2).build(),
                new ListSurahInJuz.Builder(16).build(),
        });
        //JUZ 15
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(17).build(),
                new ListSurahInJuz.Builder(18).setNomorStop(74).build(),
        });
        //JUZ 16
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(18).setNomorStart(75).build(),
                new ListSurahInJuz.Builder(19).build(),
                new ListSurahInJuz.Builder(20).build(),
        });
        //JUZ 17
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(21).build(),
                new ListSurahInJuz.Builder(22).build(),
        });
        //JUZ 18
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(23).build(),
                new ListSurahInJuz.Builder(24).build(),
                new ListSurahInJuz.Builder(25).setNomorStop(20).build(),
        });
        //JUZ 19
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(25).setNomorStart(21).build(),
                new ListSurahInJuz.Builder(26).build(),
                new ListSurahInJuz.Builder(27).setNomorStop(59).build(),
        });
        //JUZ 20
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(27).setNomorStart(60).build(),
                new ListSurahInJuz.Builder(28).build(),
                new ListSurahInJuz.Builder(29).setNomorStop(44).build(),
        });
        //JUZ 21
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(29).setNomorStart(45).build(),
                new ListSurahInJuz.Builder(30).build(),
                new ListSurahInJuz.Builder(31).build(),
                new ListSurahInJuz.Builder(32).build(),
                new ListSurahInJuz.Builder(33).setNomorStop(30).build(),
        });
        //JUZ 22
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(33).setNomorStart(31).build(),
                new ListSurahInJuz.Builder(34).build(),
                new ListSurahInJuz.Builder(35).build(),
                new ListSurahInJuz.Builder(36).setNomorStop(21).build(),
        });
        //JUZ 23
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(36).setNomorStart(22).build(),
                new ListSurahInJuz.Builder(37).build(),
                new ListSurahInJuz.Builder(38).build(),
                new ListSurahInJuz.Builder(39).setNomorStop(31).build(),
        });
        //JUZ 24
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(39).setNomorStart(32).build(),
                new ListSurahInJuz.Builder(40).build(),
                new ListSurahInJuz.Builder(41).setNomorStop(46).build(),
        });
        //JUZ 25
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(41).setNomorStart(47).build(),
                new ListSurahInJuz.Builder(42).build(),
                new ListSurahInJuz.Builder(43).build(),
                new ListSurahInJuz.Builder(44).build(),
                new ListSurahInJuz.Builder(45).build(),
        });
        //JUZ 26
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(46).build(),
                new ListSurahInJuz.Builder(47).build(),
                new ListSurahInJuz.Builder(48).build(),
                new ListSurahInJuz.Builder(49).build(),
                new ListSurahInJuz.Builder(50).build(),
                new ListSurahInJuz.Builder(51).setNomorStop(30).build(),
        });
        //JUZ 27
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(51).setNomorStart(31).build(),
                new ListSurahInJuz.Builder(52).build(),
                new ListSurahInJuz.Builder(53).build(),
                new ListSurahInJuz.Builder(54).build(),
                new ListSurahInJuz.Builder(55).build(),
                new ListSurahInJuz.Builder(56).build(),
                new ListSurahInJuz.Builder(57).build(),
        });
        //JUZ 28
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(58).build(),
                new ListSurahInJuz.Builder(59).build(),
                new ListSurahInJuz.Builder(60).build(),
                new ListSurahInJuz.Builder(61).build(),
                new ListSurahInJuz.Builder(62).build(),
                new ListSurahInJuz.Builder(63).build(),
                new ListSurahInJuz.Builder(64).build(),
                new ListSurahInJuz.Builder(65).build(),
                new ListSurahInJuz.Builder(66).build(),
        });
        //JUZ 29
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(67).build(),
                new ListSurahInJuz.Builder(68).build(),
                new ListSurahInJuz.Builder(69).build(),
                new ListSurahInJuz.Builder(70).build(),
                new ListSurahInJuz.Builder(71).build(),
                new ListSurahInJuz.Builder(72).build(),
                new ListSurahInJuz.Builder(73).build(),
                new ListSurahInJuz.Builder(74).build(),
                new ListSurahInJuz.Builder(75).build(),
                new ListSurahInJuz.Builder(76).build(),
                new ListSurahInJuz.Builder(77).build(),
        });
        //JUZ 30
        list.add(new ListSurahInJuz[]{
                new ListSurahInJuz.Builder(78).build(),
                new ListSurahInJuz.Builder(79).build(),
                new ListSurahInJuz.Builder(80).build(),
                new ListSurahInJuz.Builder(81).build(),
                new ListSurahInJuz.Builder(82).build(),
                new ListSurahInJuz.Builder(83).build(),
                new ListSurahInJuz.Builder(84).build(),
                new ListSurahInJuz.Builder(85).build(),
                new ListSurahInJuz.Builder(86).build(),
                new ListSurahInJuz.Builder(87).build(),
                new ListSurahInJuz.Builder(88).build(),
                new ListSurahInJuz.Builder(89).build(),
                new ListSurahInJuz.Builder(90).build(),
                new ListSurahInJuz.Builder(91).build(),
                new ListSurahInJuz.Builder(92).build(),
                new ListSurahInJuz.Builder(93).build(),
                new ListSurahInJuz.Builder(94).build(),
                new ListSurahInJuz.Builder(95).build(),
                new ListSurahInJuz.Builder(96).build(),
                new ListSurahInJuz.Builder(97).build(),
                new ListSurahInJuz.Builder(98).build(),
                new ListSurahInJuz.Builder(99).build(),
                new ListSurahInJuz.Builder(100).build(),
                new ListSurahInJuz.Builder(101).build(),
                new ListSurahInJuz.Builder(102).build(),
                new ListSurahInJuz.Builder(103).build(),
                new ListSurahInJuz.Builder(104).build(),
                new ListSurahInJuz.Builder(105).build(),
                new ListSurahInJuz.Builder(106).build(),
                new ListSurahInJuz.Builder(107).build(),
                new ListSurahInJuz.Builder(108).build(),
                new ListSurahInJuz.Builder(109).build(),
                new ListSurahInJuz.Builder(110).build(),
                new ListSurahInJuz.Builder(111).build(),
                new ListSurahInJuz.Builder(112).build(),
                new ListSurahInJuz.Builder(113).build(),
                new ListSurahInJuz.Builder(114).build(),
        });
    }

    public List<ListSurahInJuz[]> getList() {
        return list;
    }
}
