package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[T_B, C], C]) extends T_A[T_B, C]
case class CC_B() extends T_A[T_B, Boolean]

val v_a: T_A[T_B, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}