package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Char, Char], T_A[T_A[Char, Char], T_A[Char, Char]]], b: C) extends T_A[C, T_A[C, C]]
case class CC_B[E, F]() extends T_A[E, T_A[E, E]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(), _) => 1 
  case CC_B() => 2 
}
}