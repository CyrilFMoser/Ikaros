package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Byte], b: T_B[Byte]) extends T_A
case class CC_B(a: CC_A, b: Int, c: ((T_A,Int),Int)) extends T_A
case class CC_C() extends T_B[Byte]
case class CC_D[B](a: T_B[Byte], b: T_B[B], c: (Char,Boolean)) extends T_B[Byte]
case class CC_E(a: Boolean, b: CC_C, c: (Boolean,T_B[Int])) extends T_B[Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), CC_C()) => 0 
  case CC_A(CC_C(), CC_D(_, _, _)) => 1 
  case CC_A(CC_C(), CC_E(_, _, (_,_))) => 2 
  case CC_A(CC_D(_, _, (_,_)), CC_C()) => 3 
  case CC_A(CC_D(_, _, (_,_)), CC_D(_, _, _)) => 4 
  case CC_A(CC_D(_, _, (_,_)), CC_E(_, _, (_,_))) => 5 
  case CC_A(CC_E(_, CC_C(), (_,_)), CC_C()) => 6 
  case CC_A(CC_E(_, CC_C(), (_,_)), CC_D(_, _, _)) => 7 
  case CC_A(CC_E(_, CC_C(), (_,_)), CC_E(_, _, (_,_))) => 8 
  case CC_B(CC_A(CC_C(), _), _, ((_,_),_)) => 9 
  case CC_B(CC_A(CC_D(_, _, _), _), _, ((_,_),_)) => 10 
}
}
// This is not matched: CC_B(CC_A(CC_E(_, _, _), _), _, ((_,_),_))