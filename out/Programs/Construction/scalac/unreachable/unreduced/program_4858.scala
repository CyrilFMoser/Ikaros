package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: Int, c: Int) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: Int, b: T_A[T_A[E, E], T_A[E, Char]]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(true, _, _) => 1 
  case CC_B(false, _, _) => 2 
  case CC_C(_, _) => 3 
}
}