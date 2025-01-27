package Program_31 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D], c: D) extends T_A[T_B[Byte, Int]]

val v_a: T_A[T_B[Byte, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A (T_B Byte Int)))
// This is not matched: (CC_C Char Boolean (T_A Char Boolean))