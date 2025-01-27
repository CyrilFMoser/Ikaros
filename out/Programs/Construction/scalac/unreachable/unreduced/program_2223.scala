package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, (T_A,T_A)]) extends T_A
case class CC_B[C](a: Int, b: Char, c: T_A) extends T_A
case class CC_C[D](a: D, b: T_B[D, D], c: D) extends T_B[D, CC_A]
case class CC_D[E](a: E) extends T_B[E, CC_A]

val v_a: T_B[T_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_A(_, _), _), _, _) => 0 
  case CC_C(CC_A(CC_B(_, _, _), _), _, _) => 1 
  case CC_C(CC_B(_, _, CC_A(_, _)), _, _) => 2 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), _, _) => 3 
  case CC_D(CC_A(CC_A(_, _), _)) => 4 
  case CC_D(CC_A(CC_B(_, _, _), _)) => 5 
  case CC_D(CC_B(_, _, CC_A(_, _))) => 6 
  case CC_D(CC_B(_, _, CC_B(_, _, _))) => 7 
}
}