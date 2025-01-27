package Program_14 

package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: D, b: Int, c: T_A[D, C]) extends T_A[D, C]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(12, _, _) => 0 
  case CC_A(12, 12, _) => 1 
  case CC_A(12, _, CC_A(_, _, _)) => 2 
  case CC_A(_, _, _) => 3 
}
}
// This is not matched: (CC_A Int Int Boolean Wildcard Wildcard Wildcard (T_A Int Int))
// This is not matched: (CC_A Byte (T_A Byte Byte) (T_A Byte (T_A Byte Byte)))