package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[Char, C]], b: C) extends T_A[Char, C]
case class CC_B[D](a: Byte, b: CC_A[D], c: D) extends T_A[Char, D]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}