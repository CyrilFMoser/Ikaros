package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (T_B[Boolean],Int)) extends T_A[C]
case class CC_B[D]() extends T_A[Int]
case class CC_C[E]() extends T_B[E]
case class CC_D(a: CC_C[Char]) extends T_B[CC_C[(Byte,Byte)]]
case class CC_E() extends T_B[CC_C[CC_A[Byte]]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A((CC_C(),_)) => 0 
}
}