package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C]() extends T_A
case class CC_B[D]() extends T_B[D, T_B[(T_A,T_A), Byte]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}