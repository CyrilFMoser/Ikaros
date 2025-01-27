package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B[D](a: CC_A[D], b: T_A[D, D]) extends T_A[D, T_A[T_A[D, D], D]]

val v_a: T_A[Boolean, T_A[T_A[Boolean, Boolean], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
}
}