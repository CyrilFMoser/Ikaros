package Program_30 

package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[C, C], C]
case class CC_B(a: CC_A[Boolean, Char], b: CC_A[Byte, Boolean], c: T_A[Char, Int]) extends T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Int]], T_A[Boolean, Int]]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Int]], T_A[Boolean, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A(), _) => 1 
  case CC_B(_, CC_A(), _) => 2 
  case CC_B(CC_A(), _, _) => 3 
}
}
// This is not matched: (CC_A (T_A Boolean Int)
//      Boolean
//      (T_A (T_A (T_A Boolean Int) (T_A Boolean Int)) (T_A Boolean Int)))
// This is not matched: (CC_B Char T_B (T_A Char))