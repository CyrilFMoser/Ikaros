package Program_31 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: D) extends T_A[Byte, C]
case class CC_B[E](a: CC_A[E, E], b: T_A[E, E]) extends T_A[Byte, E]
case class CC_C() extends T_B
case class CC_D() extends T_B
case class CC_E[F]() extends T_B

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
}
}
// This is not matched: (CC_A Char T_B Wildcard (T_A Byte Char))
// This is not matched: (CC_B Int Wildcard Wildcard Wildcard (T_A Int))