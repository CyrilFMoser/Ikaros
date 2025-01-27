package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_A[Boolean]]]
case class CC_B(a: Byte) extends T_A[T_B[T_A[Boolean]]]
case class CC_C[C](a: T_A[C]) extends T_A[C]
case class CC_D[D]() extends T_B[(T_A[CC_B],T_A[CC_A])]
case class CC_E(a: CC_B, b: CC_D[Int], c: T_B[CC_A]) extends T_B[(T_A[CC_B],T_A[CC_A])]
case class CC_F(a: T_A[T_A[CC_A]]) extends T_B[(T_A[CC_B],T_A[CC_A])]

val v_a: T_B[(T_A[CC_B],T_A[CC_A])] = null
val v_b: Int = v_a match{
  case CC_E(CC_B(_), CC_D(), _) => 0 
  case CC_F(CC_C(CC_C(_))) => 1 
}
}
// This is not matched: CC_D()