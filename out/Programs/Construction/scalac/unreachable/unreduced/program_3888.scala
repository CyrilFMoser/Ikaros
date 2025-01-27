package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_B[T_A, T_A]), b: T_B[Int, Int]) extends T_A
case class CC_B(a: T_A, b: Int) extends T_A
case class CC_C(a: Char, b: T_B[Char, CC_B], c: (CC_B,T_B[T_A, (Char,Boolean)])) extends T_A
case class CC_D[C](a: C, b: C) extends T_B[C, CC_A]
case class CC_E[D, E]() extends T_B[D, CC_A]
case class CC_F[F](a: (T_B[Boolean, CC_C],T_B[T_A, CC_A]), b: F, c: T_A) extends T_B[(T_B[Byte, T_A],CC_B), F]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_B(_, _), _) => 1 
  case CC_B(CC_C(_, _, _), _) => 2 
  case CC_C(_, _, _) => 3 
}
}
// This is not matched: CC_B(CC_A(_, _), _)