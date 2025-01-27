package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[((Boolean,Byte),T_A), T_B[T_A, T_A]]) extends T_A
case class CC_B(a: Int, b: Int) extends T_A
case class CC_C[C, D](a: Boolean, b: T_B[D, T_B[T_A, C]]) extends T_B[T_A, C]
case class CC_D[E](a: T_A) extends T_B[T_A, E]
case class CC_E[F]() extends T_B[T_A, F]

val v_a: T_B[T_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_)) => 0 
  case CC_D(CC_B(_, _)) => 1 
  case CC_E() => 2 
}
}
// This is not matched: CC_C(_, _)