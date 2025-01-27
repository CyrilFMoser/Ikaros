package Program_14 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[D, C]) extends T_A[C, D]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Int Byte Boolean Wildcard (T_A Int Byte))
// This is not matched: (CC_C Char Wildcard Byte (T_B T_A Char))