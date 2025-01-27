package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_A[T_B]]) extends T_A[T_A[T_B]]
case class CC_B[B]() extends T_A[T_A[T_B]]
case class CC_C(a: CC_A, b: Boolean, c: CC_B[CC_A]) extends T_B
case class CC_D(a: CC_A, b: T_A[CC_C]) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_A(_, _), _, CC_B()), CC_A(CC_C(_, _, _), _)) => 0 
  case CC_A(CC_D(_, _), CC_A(CC_C(_, _, _), _)) => 1 
  case CC_A(CC_C(CC_A(_, _), _, CC_B()), CC_A(CC_D(_, _), _)) => 2 
  case CC_A(CC_D(_, _), CC_A(CC_D(_, _), _)) => 3 
  case CC_A(CC_C(CC_A(_, _), _, CC_B()), CC_B()) => 4 
  case CC_A(CC_D(_, _), CC_B()) => 5 
  case CC_B() => 6 
}
}