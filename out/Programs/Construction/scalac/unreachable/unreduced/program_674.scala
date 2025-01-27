package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, (T_A,T_A)]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: C, b: CC_A) extends T_B[Boolean, C]
case class CC_D[D](a: T_B[Boolean, D], b: Boolean) extends T_B[Boolean, D]
case class CC_E[E]() extends T_B[Boolean, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}