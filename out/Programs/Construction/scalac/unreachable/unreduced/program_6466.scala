package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_B[Boolean]]]
case class CC_B(a: T_A[Int], b: CC_A, c: T_A[CC_A]) extends T_A[T_B[T_B[Boolean]]]
case class CC_C[C]() extends T_B[C]
case class CC_D[D](a: T_A[D]) extends T_B[D]
case class CC_E[E]() extends T_B[E]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_) => 1 
  case CC_E() => 2 
}
}