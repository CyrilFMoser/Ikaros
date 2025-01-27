package Program_12 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Byte, b: Int, c: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: T_A[T_B]) extends T_B
case class CC_C(a: T_B, b: CC_A[(Byte,Int)]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _)) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_C(CC_B(_, _), _) => 2 
  case CC_C(_, _) => 3 
}
}
// This is not matched: (CC_B (CC_A T_B Byte Wildcard Wildcard (T_A T_B))
//      (CC_A T_B Wildcard Int Wildcard (T_A T_B))
//      T_B)
// This is not matched: (CC_B Wildcard T_A)