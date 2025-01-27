package Program_28 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[C, Byte], b: Byte) extends T_A[D, C]
case class CC_B[G, F](a: T_A[F, G]) extends T_A[G, F]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(CC_A(_, _), 0) => 1 
  case CC_A(_, _) => 2 
  case CC_A(CC_B(_), 0) => 3 
  case CC_A(CC_B(_), _) => 4 
}
}
// This is not matched: (CC_A Boolean Int Boolean Wildcard Wildcard (T_A Boolean Int))
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)