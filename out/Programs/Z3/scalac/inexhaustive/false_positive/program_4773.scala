package Program_10 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F, G](a: Byte, b: T_A[G, F], c: T_A[E, F]) extends T_A[F, E]
case class CC_B[H](a: T_A[H, H]) extends T_B[T_A[Char, Boolean], H]
case class CC_C(a: CC_B[Int], b: (Byte,Boolean)) extends T_B[T_A[Char, Boolean], T_A[Byte, Byte]]

val v_a: CC_A[Boolean, Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(0, CC_A(_, _, _), CC_A(_, _, _)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_C (CC_A Wildcard (CC_A Wildcard Wildcard Wildcard T_A) Wildcard T_A)
//      (T_B Byte))