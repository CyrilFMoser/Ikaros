package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[C, C]) extends T_A[C, Byte]
case class CC_B[D]() extends T_A[D, Byte]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}