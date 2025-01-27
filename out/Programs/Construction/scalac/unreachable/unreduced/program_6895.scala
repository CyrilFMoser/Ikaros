package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: C, c: (T_A[Int, Char],T_A[Byte, Boolean])) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C[E](a: E) extends T_A[E, T_A[E, E]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B()