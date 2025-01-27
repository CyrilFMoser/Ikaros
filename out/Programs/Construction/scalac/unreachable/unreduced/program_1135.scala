package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: C) extends T_A[C, T_A[T_A[Byte, Boolean], Char]]
case class CC_B[D](a: D, b: Int, c: D) extends T_A[D, T_A[T_A[Byte, Boolean], Char]]

val v_a: T_A[Char, T_A[T_A[Byte, Boolean], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}