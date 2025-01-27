package Program_29 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[F, E, G](a: Byte, b: (Int,Char)) extends T_B[F, E]
case class CC_C() extends T_B[CC_B[Boolean, Char, Byte], CC_A[Boolean]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _)) => 0 
}
}
// This is not matched: (CC_A Boolean
//      (CC_B Boolean Boolean Boolean Wildcard Wildcard (T_B Boolean Boolean))
//      (T_A Boolean))
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard (T_B (T_B (CC_A T_A T_A) T_A) T_A))