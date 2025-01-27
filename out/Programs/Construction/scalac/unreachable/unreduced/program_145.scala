package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Boolean, Boolean]], b: T_A[T_A[Byte]]) extends T_A[(T_B[Char, Byte],Byte)]
case class CC_B(a: T_B[Char, T_A[CC_A]], b: Boolean, c: CC_A) extends T_A[(T_B[Char, Byte],Byte)]
case class CC_C[D, E](a: E, b: (CC_B,T_B[Int, CC_A])) extends T_B[E, D]

val v_a: T_A[(T_B[Char, Byte],Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}