package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B], b: (T_A[T_B, T_B],T_B), c: T_A[C, C]) extends T_A[C, T_B]
case class CC_B(a: T_A[Int, T_B], b: T_B) extends T_A[Int, T_B]
case class CC_C() extends T_B
case class CC_D(a: T_B) extends T_B
case class CC_E(a: T_A[T_A[Int, T_B], T_B]) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
}
}