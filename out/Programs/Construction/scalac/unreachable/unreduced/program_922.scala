package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Char],Int)) extends T_A[C, T_A[Boolean, C]]
case class CC_B[D](a: T_A[Int, D], b: Boolean) extends T_A[D, T_A[Boolean, D]]
case class CC_C[E](a: CC_A[E], b: T_A[E, T_A[Boolean, E]], c: E) extends T_A[E, T_A[Boolean, E]]

val v_a: T_A[Byte, T_A[Boolean, Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}