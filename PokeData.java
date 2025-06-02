
class InstanceData {// 개체값) 처음 포획시, 알에서 부화했을 시 정해지며 변하지 않음
    private int Length;//키
    private float Waight;//무게
    private boolean Sex;//성별
    private String Nature;
}

class SpeciesData {// 불변값
    private int Generation;//세대
    private int Number;//고유번호
    private String Name;//이름
    private String Type;//타입
    private float CaptureRate;//포획률
    private String Info;//특성
    private int BaseStats;//종족값 총합
}