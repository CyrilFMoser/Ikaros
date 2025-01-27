package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: C, c: C) extends T_A[C, (T_A[Byte, Boolean],T_A[Boolean, Char])]
case class CC_B[D](a: T_A[D, D], b: CC_A[D]) extends T_A[D, (T_A[Byte, Boolean],T_A[Boolean, Char])]

val v_a: T_A[Char, (T_A[Byte, Boolean],T_A[Boolean, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}