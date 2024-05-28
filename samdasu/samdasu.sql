create SEQUENCE mseq INCREMENT BY 1 START WITH 1 MINVALUE 1 MAXVALUE 9999 NOCYCLE;
drop SEQUENCE mseq;
ALTER SESSION SET NLS_DATE_FORMAT='YYYY/MM/DD HH24:MI:SS';


drop table member;
desc member;
create table member(mnum int primary key , 
                  id varchar(20) unique not null , 
                  pw varchar(1000) not null ,
                  mname varchar(500) not null ,
                  email varchar(500) not null ,
                  tel varchar(500) not null ,
                  addr1 varchar(200) not null ,
                  addr2 varchar(100) not null ,
                  postcode varchar(20) not null ,
                  birth date not null , 
                  resdate DATE default sysdate
);
select * from member;
insert into member values(mseq.NEXTVAL , 'admin' , '1234' , '관리자' , 'admin@123123', '010-5555-8888'  ,'광화문' , '7층' ,  '232-32' , '2000-04-05' ,default
);

drop table product;
desc product;
create table product(pnum int primary key ,
                     cate varchar(50) not null ,
                     pname varchar(100) not null ,
                     pcomment varchar(1000) , 
                     pprice int not null ,
                     img varchar(500)
);      

drop table inventory;
desc inventory;
create table inventory(inum int primary key ,
                     pnum int ,
                     iprice int ,
                     oprice int , 
                     amount int default 1 ,
                     remark varchar(200) ,
                     resdate DATE default sysdate ,
                     FOREIGN key(pnum) REFERENCES product(pnum)
);
drop table sales;
select * from sales;
desc sales;
create table sales(snum int primary key ,
                   pnum int ,
                   amount int default 1 ,
                   tot int ,
                   id varchar(20) ,
                   paymethod varchar(20) ,
                   paynum varchar(50) ,
                   addr varchar(300) ,
                   tel varchar(100) ,
                   delcom varchar(50) ,
                   deltel varchar(50) ,
                   delnum varchar(50) , 
                   delstatus varchar(20) ,
                   st varchar(20) ,
                   FOREIGN key(pnum) REFERENCES product(pnum)
);
                   
create SEQUENCE bseq INCREMENT BY 1 START WITH 1 MINVALUE 1 MAXVALUE 9999 NOCYCLE;                   
drop table board;
desc board;
create table board(bnum int primary key,
                   author varchar(300) default 'admin',
                   btitle varchar(1000) not null ,
                   bcomment varchar(2000) not null ,
                   vcnt int default 0,
                   resdate DATE default sysdate
);
insert into board values(bseq.NEXTVAL ,default , '타이틀1' , '코멘트1' , default , default);



drop table qna;
desc qna;
create SEQUENCE qseq INCREMENT BY 1 START WITH 1 MINVALUE 1 MAXVALUE 9999 NOCYCLE;
create table qna(qnum int primary key ,
                 id varchar(20) ,
                 qtitle varchar(300) not null ,
                 qcomment varchar(1500) not null ,
                 q_level int default 1 not null ,
                 parno int ,
                 hits int default 0 ,
                 resdate DATE default sysdate ,
                 FOREIGN KEY (id) REFERENCES member(id)
);

desc fileboard;
create table fileboard(fbnum int primary key ,
                       fbtitle varchar(200) ,
                       content varchar(1000) ,
                       url varchar(300) ,
                       hits int default 0 ,
                       resdate DATE default sysdate , 
                       author varchar(20)
);

desc free;
drop table free;
create SEQUENCE fseq INCREMENT BY 1 START WITH 1 MINVALUE 1 MAXVALUE 9999 NOCYCLE;
create table free(fnum int primary key ,
                  title varchar(400) not null ,
                  content varchar(1000) not null ,
                  hits int default 0, 
                  id varchar(20) , FOREIGN KEY (id) REFERENCES member(id) ,
                  name varchar(100) ,
                  resdate DATE default sysdate 
);
insert into free values(fseq.NEXTVAL , '프리타이틀1' , '프리코멘트1' , default , 'admin' , '관리자' ,default);

select f.fno , f.title , f.content , f.hits , f.name , f.resdate , m.id , m.mname from free f join member m on f.id=m.id;



desc product;
create table product(pno int primary key,
                     cate varchar(20) not null, 
                     pname varchar(100) not null, 
                     com varchar(1000), 
                     price int default 1000, 
                     img varchar(300)
);


create table basket(bkno int primary key,
                    id varchar(20) ,
                    pno int , 
                    amount int ,
                    remark varchar(100), 
                    resdate DATE default sysdate ,
                    FOREIGN KEY (id) REFERENCES member(id) ,
                    FOREIGN KEY (pno) REFERENCES product(pno)
);




commit;
