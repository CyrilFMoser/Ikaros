package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[Char, T_A[Byte, Byte]], C]
case class CC_B[D](a: T_A[D, CC_A[D]], b: CC_A[D]) extends T_A[T_A[Char, T_A[Byte, Byte]], D]

val v_a: T_A[T_A[Char, T_A[Byte, Byte]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
}
}