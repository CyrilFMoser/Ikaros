package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, Char]
case class CC_C[E](a: T_A[E, E]) extends T_A[E, Char]

val v_a: T_A[T_A[Char, T_A[Char, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}