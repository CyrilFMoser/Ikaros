package Program_28 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[C, Boolean]) extends T_A[C, D]
case class CC_B[F](a: Byte, b: T_A[Boolean, F], c: F) extends T_A[F, T_A[Byte, Boolean]]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Char
//      Int
//      Boolean
//      (CC_A Char Boolean Boolean Wildcard (T_A Char Boolean))
//      (T_A Char Int))
// This is not matched: (CC_B (Tuple T_B T_B) Wildcard Wildcard Wildcard (T_A (Tuple T_B T_B)))