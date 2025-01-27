package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: D, c: T_B[D]) extends T_A[T_B[D], D]
case class CC_B[E](a: Int, b: T_A[T_B[E], E], c: Int) extends T_A[T_B[E], E]
case class CC_C(a: T_A[CC_B[Char], T_A[(Byte,Boolean), Int]], b: T_A[T_B[T_B[Boolean]], T_B[Boolean]]) extends T_B[T_B[Char]]

val v_a: T_A[T_B[Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}