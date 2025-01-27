package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[T_A, T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C[C]() extends T_B[CC_A, C]
case class CC_D[D](a: T_A, b: T_B[D, D]) extends T_B[D, Char]
case class CC_E[E](a: (T_B[Int, Char],T_B[CC_A, T_A]), b: T_B[Int, E], c: T_B[E, Char]) extends T_B[E, Char]

val v_a: T_B[Char, Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_A(_, _), _), _) => 0 
  case CC_D(CC_A(CC_B(), _), _) => 1 
  case CC_D(CC_B(), _) => 2 
  case CC_E((CC_D(_, _),CC_C()), _, _) => 3 
  case CC_E((CC_E(_, _, _),CC_C()), _, _) => 4 
}
}