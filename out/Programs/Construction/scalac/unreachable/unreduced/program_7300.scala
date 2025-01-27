package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[(T_A[Boolean],T_A[Byte])]
case class CC_B(a: T_B[T_B[Int]], b: Int, c: T_B[T_B[Int]]) extends T_A[(T_A[Boolean],T_A[Byte])]
case class CC_C[D]() extends T_A[D]
case class CC_D() extends T_B[T_A[(CC_B,CC_B)]]

val v_a: T_A[(T_A[Boolean],T_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}