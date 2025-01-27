package Program_30 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[T_A[T_B]]
case class CC_B[B](a: B) extends T_A[B]
case class CC_C(a: Char, b: T_A[(Byte,Char)]) extends T_A[Char]
case class CC_D(a: CC_C, b: Boolean, c: Byte) extends T_B
case class CC_E[C](a: C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(_) => 0 
  case CC_D(CC_C(_, _), _, 0) => 1 
  case CC_D(_, _, _) => 2 
}
}
// This is not matched: (CC_E T_B Wildcard T_B)
// This is not matched: (CC_F Int Wildcard Wildcard Int (T_B Int))