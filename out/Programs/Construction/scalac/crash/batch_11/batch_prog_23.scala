package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: B) extends T_A
case class CC_B(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_C[C](a: CC_A[C]) extends T_B[C]
case class CC_D[D](a: CC_C[D]) extends T_B[D]
case class CC_E[E]() extends T_B[E]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_A(_))) => 0 
  case CC_C(CC_A(CC_B(_, _, _))) => 1 
  case CC_D(CC_C(CC_A(_))) => 2 
  case CC_E() => 3 
}
}