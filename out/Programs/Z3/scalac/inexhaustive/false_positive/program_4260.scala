package Program_15 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[Char, T_A[Byte, Byte]]
case class CC_B(a: Boolean, b: CC_A[Byte], c: CC_A[Int]) extends T_A[Char, T_A[Byte, Byte]]

val v_a: T_A[Char, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), CC_A(_)) => 1 
}
}
// This is not matched: (CC_A (T_A Boolean Boolean) Wildcard (T_A Char (T_A Byte Byte)))
// This is not matched: (CC_B Byte Wildcard Wildcard (T_A Byte))