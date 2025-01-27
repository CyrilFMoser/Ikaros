package Program_15 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C, E](a: C, b: C, c: Int) extends T_A[D, C]
case class CC_B[F](a: CC_A[F, F, F]) extends T_A[F, CC_A[F, F, F]]

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_A(0, _, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_A(_, 0, 12) => 2 
  case CC_A(_, 0, _) => 3 
  case CC_A(0, _, 12) => 4 
  case CC_A(0, 0, _) => 5 
  case CC_A(_, _, 12) => 6 
}
}
// This is not matched: (CC_A T_B Byte T_B Wildcard Wildcard Wildcard (T_A T_B Byte))
// This is not matched: (CC_F T_B)