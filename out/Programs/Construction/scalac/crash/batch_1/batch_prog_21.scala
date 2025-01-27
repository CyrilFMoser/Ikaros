package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Byte, b: Int) extends T_A[D]
case class CC_B[F, E](a: T_B[T_A[F], E], b: T_B[E, F]) extends T_B[F, E]
case class CC_C[H, G]() extends T_B[G, H]
case class CC_D[I, J](a: T_B[J, I], b: T_B[I, J]) extends T_B[I, J]

val v_a: T_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, CC_B(_, _)), _) => 0 
  case CC_B(CC_B(_, CC_C()), _) => 1 
  case CC_B(CC_B(_, CC_D(_, _)), _) => 2 
  case CC_B(CC_C(), _) => 3 
  case CC_B(CC_D(_, CC_B(_, _)), _) => 4 
  case CC_B(CC_D(_, CC_D(_, _)), _) => 5 
  case CC_C() => 6 
  case CC_D(_, _) => 7 
}
}
// This is not matched: CC_B(CC_D(_, CC_C()), _)