package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Int]]
case class CC_B(a: T_A[CC_A], b: CC_A, c: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_C(a: T_A[T_A[Int]]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
  case CC_B(_, _, CC_B(_, CC_A(), CC_A())) => 2 
  case CC_B(_, _, CC_B(_, CC_A(), CC_B(_, _, _))) => 3 
  case CC_B(_, _, CC_B(_, CC_A(), CC_C(_))) => 4 
  case CC_B(_, _, CC_C(CC_A())) => 5 
  case CC_B(_, _, CC_C(CC_B(_, _, _))) => 6 
  case CC_B(_, _, CC_C(CC_C(_))) => 7 
  case CC_C(_) => 8 
}
}