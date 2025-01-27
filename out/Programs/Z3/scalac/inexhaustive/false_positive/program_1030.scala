package Program_30 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Byte,Char)], b: T_A[Int]) extends T_A[T_B[Char]]
case class CC_B[C](a: Char, b: C) extends T_A[C]
case class CC_C(a: T_B[CC_A], b: CC_B[CC_A]) extends T_A[T_B[Char]]
case class CC_D[D, E]() extends T_B[D]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
}
}
// This is not matched: (CC_D Boolean Boolean (T_B Boolean))
// This is not matched: (CC_F Wildcard Wildcard T_B)