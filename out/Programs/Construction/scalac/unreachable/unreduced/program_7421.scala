package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Boolean, Boolean], b: T_A, c: T_B[Boolean, T_A]) extends T_A
case class CC_B[C](a: C, b: T_A) extends T_B[C, T_B[C, C]]
case class CC_C[D, E]() extends T_B[D, T_B[D, D]]
case class CC_D[F, G](a: F, b: CC_C[F, G]) extends T_B[F, T_B[F, F]]

val v_a: T_B[Byte, T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_B(0, CC_A(_, _, _)) => 0 
  case CC_C() => 1 
  case CC_D(_, _) => 2 
}
}
// This is not matched: CC_B(_, CC_A(_, _, _))