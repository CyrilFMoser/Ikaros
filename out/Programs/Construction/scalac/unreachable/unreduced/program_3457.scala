package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Byte]) extends T_A[Byte]
case class CC_B(a: T_A[(CC_A,CC_A)]) extends T_A[Byte]
case class CC_C(a: Int, b: T_B[Int]) extends T_A[Byte]
case class CC_D[C]() extends T_B[C]
case class CC_E(a: T_A[Byte]) extends T_B[CC_A]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_)) => 1 
  case CC_A(CC_C(_, _)) => 2 
}
}