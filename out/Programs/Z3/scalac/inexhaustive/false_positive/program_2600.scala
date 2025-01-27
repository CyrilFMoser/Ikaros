package Program_31 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, E], b: T_A[E, E]) extends T_A[F, E]
case class CC_B[H, G]() extends T_A[H, G]
case class CC_C[I](a: T_A[I, I]) extends T_A[I, T_A[Char, Int]]
case class CC_D(a: CC_A[Byte, Int]) extends T_B[CC_C[Char], T_A[(Byte,Boolean), Char]]
case class CC_E[J](a: Boolean, b: CC_D) extends T_B[CC_C[Char], T_A[(Byte,Boolean), Char]]
case class CC_F(a: T_A[CC_D, CC_D], b: T_A[CC_D, CC_D]) extends T_B[CC_C[Char], T_A[(Byte,Boolean), Char]]

val v_a: T_B[CC_C[Char], T_A[(Byte,Boolean), Char]] = null
val v_b: Int = v_a match{
  case CC_E(_, _) => 0 
  case CC_D(_) => 1 
  case CC_F(_, _) => 2 
}
}
// This is not matched: (CC_E Boolean
//      Wildcard
//      Wildcard
//      (T_B (CC_C Char Boolean Boolean) (T_A (Tuple Byte Boolean) Char)))
// This is not matched: Pattern match is empty without constants