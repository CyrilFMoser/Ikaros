package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Char]], C]
case class CC_B() extends T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Char]], Boolean]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Char]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}