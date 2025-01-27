package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[Char, T_A]]) extends T_A
case class CC_B(a: T_A, b: Int) extends T_A
case class CC_C(a: T_B[CC_A, CC_B], b: T_A, c: CC_B) extends T_A
case class CC_D[C]() extends T_B[C, CC_A]
case class CC_E[D]() extends T_B[Byte, D]
case class CC_F[E](a: Boolean) extends T_B[Byte, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, CC_B(CC_A(_), _)) => 2 
  case CC_C(_, _, CC_B(CC_B(_, _), _)) => 3 
  case CC_C(_, _, CC_B(CC_C(_, _, _), _)) => 4 
}
}