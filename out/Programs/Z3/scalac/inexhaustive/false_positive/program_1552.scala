package Program_31 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F, G](a: E, b: T_A[E, E]) extends T_A[F, E]
case class CC_B() extends T_B[Int, T_A[Int, Byte]]
case class CC_C[H](a: CC_A[H, CC_B, H], b: H, c: H) extends T_B[H, T_B[H, H]]

val v_a: CC_A[Boolean, Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Char
//      Byte
//      Wildcard
//      (CC_A Boolean Boolean Boolean Wildcard Wildcard (T_A Boolean Boolean))
//      (T_A Char Boolean))
// This is not matched: Pattern match is empty without constants