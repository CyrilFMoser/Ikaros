package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Boolean], b: T_B[Byte]) extends T_A[T_A[(Int,Char)]]
case class CC_B[C]() extends T_B[C]
case class CC_C[D]() extends T_B[D]

val v_a: T_A[T_A[(Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: (CC_C Byte (T_A Byte))