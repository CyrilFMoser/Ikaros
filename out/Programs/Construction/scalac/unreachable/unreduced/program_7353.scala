package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,T_A), T_B[T_A, T_A]], b: T_A, c: (Char,T_B[Byte, T_A])) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: Int) extends T_A
case class CC_D[C](a: CC_C, b: T_A) extends T_B[Int, C]
case class CC_E[D, E](a: (T_A,Char), b: E) extends T_B[Int, D]
case class CC_F[F](a: CC_A, b: T_B[F, F], c: CC_D[F]) extends T_B[Int, F]

val v_a: T_B[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E((CC_A(_, _, _),_), _) => 1 
  case CC_E((CC_B(_),_), _) => 2 
  case CC_E((CC_C(_),_), _) => 3 
  case CC_F(_, _, CC_D(_, CC_B(_))) => 4 
  case CC_F(_, _, CC_D(_, CC_C(_))) => 5 
}
}
// This is not matched: CC_F(_, _, CC_D(_, CC_A(_, _, _)))