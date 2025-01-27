package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean, b: C, c: T_A[(T_B,T_B), C]) extends T_A[(T_B,T_B), C]
case class CC_B(a: CC_A[CC_A[T_B]]) extends T_B
case class CC_C(a: (T_A[Char, T_B],Char), b: CC_B, c: T_B) extends T_B
case class CC_D(a: Boolean, b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C((_,_), _, _) => 1 
}
}
// This is not matched: CC_D(_, CC_B(CC_A(_, _, _)))