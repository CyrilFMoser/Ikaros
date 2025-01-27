package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_B]]
case class CC_B[B](a: Int, b: CC_A, c: (T_A[CC_A],CC_A)) extends T_A[T_A[T_B]]
case class CC_C[C](a: T_A[T_A[T_B]]) extends T_A[C]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}