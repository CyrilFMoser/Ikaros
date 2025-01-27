package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: ((T_A,T_A),T_B[T_A, T_A])) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C[C](a: T_B[Char, C]) extends T_B[Char, C]
case class CC_D[D](a: D, b: D, c: Int) extends T_B[Char, D]
case class CC_E[E]() extends T_B[Char, E]

val v_a: T_B[Char, T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
  case CC_C(CC_D(_, CC_A(_), _)) => 1 
  case CC_C(CC_D(_, CC_B(_, _), _)) => 2 
  case CC_C(CC_E()) => 3 
  case CC_D(_, CC_A((_,_)), _) => 4 
  case CC_D(_, CC_B(_, _), _) => 5 
  case CC_E() => 6 
}
}