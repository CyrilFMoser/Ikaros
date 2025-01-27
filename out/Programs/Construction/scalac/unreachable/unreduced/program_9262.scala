package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[(T_A,T_A), T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[C, D]() extends T_B[Byte, C]
case class CC_E[E](a: CC_A, b: T_A, c: E) extends T_B[Byte, E]
case class CC_F[F]() extends T_B[Byte, F]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(), _) => 1 
  case CC_A(CC_C(_), _) => 2 
  case CC_B() => 3 
  case CC_C(CC_A(CC_A(_, _), _)) => 4 
  case CC_C(CC_A(CC_B(), _)) => 5 
  case CC_C(CC_A(CC_C(_), _)) => 6 
  case CC_C(CC_B()) => 7 
  case CC_C(CC_C(CC_A(_, _))) => 8 
  case CC_C(CC_C(CC_B())) => 9 
}
}
// This is not matched: CC_C(CC_C(CC_C(_)))