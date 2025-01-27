package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Byte]
case class CC_B[D]() extends T_B[D, T_B[T_A[CC_A], T_A[Byte]]]
case class CC_C[E](a: CC_B[T_A[(Int,Byte)]]) extends T_B[E, T_B[T_A[CC_A], T_A[Byte]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}