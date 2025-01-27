package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,Int), b: T_B[T_B[(Byte,Int), T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_A, b: Char) extends T_A
case class CC_C(a: Boolean, b: T_A) extends T_A
case class CC_D[C](a: Byte) extends T_B[CC_C, C]
case class CC_E[D]() extends T_B[Char, D]
case class CC_F[E](a: T_B[Char, E]) extends T_B[CC_C, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_A(_, _)) => 2 
  case CC_C(_, CC_B(CC_A(_, _), _)) => 3 
  case CC_C(_, CC_B(CC_B(_, _), _)) => 4 
  case CC_C(_, CC_B(CC_C(_, _), _)) => 5 
  case CC_C(_, CC_C(_, CC_A(_, _))) => 6 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 7 
}
}
// This is not matched: CC_C(_, CC_C(_, CC_B(_, _)))