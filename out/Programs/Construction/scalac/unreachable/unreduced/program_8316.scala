package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[Int, Boolean]
case class CC_B(a: CC_A) extends T_A[Int, Boolean]
case class CC_C(a: T_B, b: CC_A, c: CC_B) extends T_B
case class CC_D(a: (T_A[CC_A, CC_C],Char)) extends T_B
case class CC_E(a: (CC_C,Char), b: T_A[CC_B, CC_A]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_E((CC_C(_, _, _),_), _) => 1 
}
}
// This is not matched: CC_D((_,_))