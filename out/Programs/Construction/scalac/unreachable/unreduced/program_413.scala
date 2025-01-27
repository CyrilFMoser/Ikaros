package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean], b: C, c: T_A[C, C]) extends T_A[T_A[T_A[Byte, Char], ((Boolean,Boolean),Boolean)], C]
case class CC_B[D]() extends T_A[T_A[T_A[Byte, Char], ((Boolean,Boolean),Boolean)], D]
case class CC_C[E](a: CC_B[E]) extends T_A[T_A[T_A[Byte, Char], ((Boolean,Boolean),Boolean)], E]

val v_a: T_A[T_A[T_A[Byte, Char], ((Boolean,Boolean),Boolean)], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}