package Program_15 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_B) extends T_A[T_B, C]
case class CC_B[E, F](a: Boolean, b: T_A[T_B, E], c: Int) extends T_A[F, E]
case class CC_C(a: (T_B,T_B), b: T_A[T_B, Byte], c: T_A[T_B, T_B]) extends T_B

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), 12) => 1 
  case CC_B(_, _, _) => 2 
}
}
// This is not matched: (CC_A Byte T_B Wildcard (T_A T_B Byte))
// This is not matched: (CC_A (CC_A Char Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      (T_A (CC_A Char Boolean Boolean Boolean)
//           (T_A (Tuple Char Char) (Tuple Boolean Byte))))