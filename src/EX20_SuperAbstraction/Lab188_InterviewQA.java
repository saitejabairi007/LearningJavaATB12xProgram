package EX20_SuperAbstraction;

public class Lab188_InterviewQA {
}
interface I11{}//possible
interface I12{}//posiible
class A1{}//possible
class B1{}//possible
class Test1 extends A1{}
//class Test2 extends A1,B1{} // class Test2 extends A1,B1{} // Multiple Interheirn in class is not allowed

class Test3 implements I11{}
class Test4 implements I12,I11{}
class Test5 extends A1 implements I11,I12{}
//class Test5 implements I11 extends A{}
//interface I3 extends A1{}