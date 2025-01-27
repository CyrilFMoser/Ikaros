package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: T_A[Byte]) extends T_A[(T_A[Boolean],T_A[Int])]
case class CC_B() extends T_A[(T_A[Boolean],T_A[Int])]
case class CC_C(a: T_A[(CC_B,CC_B)]) extends T_A[(T_A[Boolean],T_A[Int])]

val v_a: T_A[(T_A[Boolean],T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}