package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, (Int,T_A[Char, Byte])]
case class CC_B[D](a: CC_A[D], b: Byte) extends T_A[D, (Int,T_A[Char, Byte])]
case class CC_C[E](a: CC_B[E], b: T_A[E, E]) extends T_A[E, (Int,T_A[Char, Byte])]

val v_a: T_A[Boolean, (Int,T_A[Char, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, 0) => 1 
  case CC_B(_, _) => 2 
  case CC_C(_, _) => 3 
}
}