package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[T_A[C, C], C], C]
case class CC_B[D]() extends T_A[T_A[T_A[D, D], D], D]

val v_a: T_A[T_A[T_A[Boolean, Boolean], Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}