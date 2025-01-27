package Program_13 

package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: D, b: Int, c: T_A[D, C]) extends T_A[D, C]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Int Int Boolean Wildcard Wildcard Wildcard (T_A Int Int))
// This is not matched: (CC_A Byte (T_A Byte Byte) (T_A Byte (T_A Byte Byte)))