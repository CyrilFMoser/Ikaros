package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[(T_B,T_B), C]) extends T_A[C, T_B]
case class CC_B[D]() extends T_A[D, T_B]

val v_a: T_A[Int, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}