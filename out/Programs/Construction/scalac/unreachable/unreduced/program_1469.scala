package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: ((Int,Byte),T_A[Boolean, Int]), b: T_A[C, C]) extends T_A[C, Int]
case class CC_B[D]() extends T_A[D, Int]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}