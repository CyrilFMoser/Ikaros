package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[Char, T_B], C]
case class CC_B[D](a: (Char,Int), b: D, c: D) extends T_A[T_A[Char, T_B], D]

val v_a: T_A[T_A[Char, T_B], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,12), _, _) => 1 
}
}
// This is not matched: CC_B((_,_), _, _)