package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: C) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[Boolean, D]
case class CC_C[E](a: T_A[E, E], b: T_A[Boolean, E], c: Int) extends T_A[E, T_A[E, E]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_C(_, _, _), _), _) => 1 
  case CC_A(CC_C(_, CC_B(), _), _) => 2 
  case CC_C(_, _, 12) => 3 
  case CC_C(_, _, _) => 4 
}
}