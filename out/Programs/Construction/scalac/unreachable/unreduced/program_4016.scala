package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte) extends T_A[T_B[T_B[Boolean, (Int,Byte)], T_B[Char, Byte]]]
case class CC_B(a: T_A[T_B[CC_A, CC_A]], b: T_A[(Char,CC_A)]) extends T_A[T_B[T_B[Boolean, (Int,Byte)], T_B[Char, Byte]]]
case class CC_C[D](a: T_B[D, D]) extends T_B[Boolean, D]
case class CC_D[E](a: T_B[Boolean, E]) extends T_B[Boolean, E]

val v_a: T_B[Boolean, CC_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_)) => 0 
  case CC_D(CC_D(_)) => 1 
}
}
// This is not matched: CC_C(_)