package Program_30 

package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Char, Byte], T_A[Int, Int]]
case class CC_B(a: CC_A[Char], b: Byte, c: T_A[Boolean, Int]) extends T_A[T_A[Char, Byte], T_A[Int, Int]]

val v_a: T_A[T_A[Char, Byte], T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
}
}
// This is not matched: (CC_A Boolean (T_A (T_A Char Byte) (T_A Int Int)))
// This is not matched: (CC_A Int (CC_A Int Wildcard Wildcard (T_A Int)) Wildcard (T_A Int))