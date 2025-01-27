package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: (T_A[(Int,Boolean), Char],T_A[Char, Boolean])) extends T_A[T_A[T_A[Byte, Boolean], Char], C]
case class CC_B[D](a: D, b: Int) extends T_A[T_A[T_A[Byte, Boolean], Char], D]
case class CC_C[E]() extends T_A[T_A[T_A[Byte, Boolean], Char], E]

val v_a: T_A[T_A[T_A[Byte, Boolean], Char], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}