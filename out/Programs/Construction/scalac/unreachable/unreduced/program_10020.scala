package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_B]
case class CC_B[D](a: T_B, b: D, c: D) extends T_A[CC_A[T_A[T_B, T_B]], D]
case class CC_C(a: Char, b: CC_B[CC_B[T_B]], c: T_A[CC_A[T_B], ((Char,Boolean),T_B)]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D() => 1 
}
}