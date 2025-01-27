package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: Char, c: (T_A,Char)) extends T_A
case class CC_B(a: (T_A,T_B[CC_A]), b: Int, c: Int) extends T_A
case class CC_C() extends T_A
case class CC_D(a: T_B[Boolean]) extends T_B[T_A]
case class CC_E(a: T_A, b: CC_A) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((_,_), _, _) => 1 
}
}
// This is not matched: CC_C()