package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[T_B, C], C]) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C(a: T_B, b: T_A[T_B, T_A[T_B, T_B]], c: (T_B,CC_B[T_B])) extends T_B
case class CC_D(a: T_A[T_B, T_B], b: T_A[T_B, T_A[T_B, T_B]], c: T_A[T_B, CC_B[CC_C]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_), _) => 0 
  case CC_C(_, CC_B(), _) => 1 
  case CC_D(_, _, CC_A(_)) => 2 
  case CC_D(_, _, CC_B()) => 3 
}
}