package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Int]]
case class CC_B(a: CC_A, b: T_A[T_A[CC_A]]) extends T_A[T_A[Int]]
case class CC_C(a: CC_A, b: T_A[T_A[Int]]) extends T_A[T_A[Int]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), CC_B(CC_A(), _)) => 0 
  case CC_C(CC_A(), CC_C(CC_A(), CC_A())) => 1 
  case CC_C(CC_A(), CC_C(CC_A(), CC_B(_, _))) => 2 
  case CC_C(CC_A(), CC_C(CC_A(), CC_C(_, _))) => 3 
}
}
// This is not matched: CC_C(CC_A(), CC_A())