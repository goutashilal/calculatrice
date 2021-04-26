package model;

public enum NumberEnum {

    _1('1'),
    _2 ('2'),
    _3 ('3'),
    _4 ('4'),
    _5 ('5'),
    _6('6'),
    _7('7'),
    _8('8'),
    _9('9'),
    _0('0');

    private  char  number;
    NumberEnum(char number){
        this.number = number;

    }

    public  char getNumberChar ()
    {
       return  number;
    }

}
