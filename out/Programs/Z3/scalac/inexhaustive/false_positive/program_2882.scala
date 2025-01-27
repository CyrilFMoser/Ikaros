package Program_31 

package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[D, D]) extends T_A[C, D]
case class CC_B[G, F](a: ((Char,Byte),Boolean), b: Byte) extends T_A[G, F]
case class CC_C[H](a: T_A[H, H], b: CC_B[H, H], c: H) extends T_A[H, CC_A[Char, Char, Boolean]]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
  case CC_B(((_,_),_), _) => 1 
  case CC_A(_) => 2 
}
}
// This is not matched: (CC_A Boolean Boolean (T_A Boolean Boolean) Wildcard (T_A Boolean Boolean))
// This is not matched: (CC_B (CC_B Wildcard T_A) T_A)