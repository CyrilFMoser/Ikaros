package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: (Byte,Byte), b: Int, c: T_A) extends T_A
case class CC_C(a: CC_B, b: CC_A, c: (Byte,T_B[CC_A])) extends T_A
case class CC_D(a: T_A, b: Byte) extends T_B[Int]
case class CC_E[B](a: CC_A, b: CC_A, c: CC_B) extends T_B[Int]
case class CC_F(a: T_B[T_A], b: Int, c: T_B[T_A]) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,_), 12, CC_A(_, _)) => 1 
  case CC_B((_,_), 12, CC_B(_, _, _)) => 2 
  case CC_B((_,_), 12, CC_C(_, _, _)) => 3 
  case CC_B((_,_), _, CC_A(_, _)) => 4 
  case CC_B((_,_), _, CC_B(_, _, _)) => 5 
  case CC_B((_,_), _, CC_C(_, _, _)) => 6 
}
}
// This is not matched: CC_C(CC_B(_, _, _), _, (_,_))