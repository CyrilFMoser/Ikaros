package Program_31 

package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: Byte) extends T_A[E, F]
case class CC_B[G](a: Boolean, b: T_A[G, G], c: CC_A[G, G]) extends T_B[T_A[Boolean, Int], G]
case class CC_C[H, I](a: I) extends T_B[T_A[Boolean, Int], H]

val v_a: T_B[T_A[Boolean, Int], Char] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_B(_, CC_A(_), _) => 1 
  case CC_B(_, _, CC_A(_)) => 2 
}
}
// This is not matched: (CC_C Char
//      (CC_A Boolean (T_A Boolean Boolean) Boolean Boolean)
//      Wildcard
//      (T_B (T_A Boolean Int) Char))
// This is not matched: (CC_C Char Boolean Boolean (T_B (T_A Boolean Int) Char))