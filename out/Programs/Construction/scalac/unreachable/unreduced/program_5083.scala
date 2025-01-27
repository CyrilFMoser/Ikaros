package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Boolean],Boolean)) extends T_A[T_A[T_A[Byte, Boolean], T_A[Int, Byte]], C]
case class CC_B[D](a: D, b: Boolean) extends T_A[T_A[T_A[Byte, Boolean], T_A[Int, Byte]], D]
case class CC_C[E](a: T_A[E, E], b: CC_A[E]) extends T_A[T_A[T_A[Byte, Boolean], T_A[Int, Byte]], E]

val v_a: T_A[T_A[T_A[Byte, Boolean], T_A[Int, Byte]], Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_A(_)) => 2 
}
}