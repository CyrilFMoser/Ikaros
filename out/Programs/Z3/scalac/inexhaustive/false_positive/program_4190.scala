package Program_14 

package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: CC_A[C], b: CC_A[C], c: CC_A[C]) extends T_A[T_A[Int]]
case class CC_C(a: CC_B[Byte], b: T_A[Char]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
  case CC_B(CC_A(), CC_A(), _) => 2 
  case CC_B(CC_A(), _, CC_A()) => 3 
  case CC_C(_, _) => 4 
  case CC_C(CC_B(_, _, _), _) => 5 
}
}
// This is not matched: (CC_B Boolean Wildcard Wildcard Wildcard (T_A (T_A Int)))
// This is not matched: (CC_A T_A)