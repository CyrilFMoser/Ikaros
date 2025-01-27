package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Boolean) extends T_A[(T_B[Boolean],T_A[Boolean])]
case class CC_B(a: CC_A, b: T_B[(CC_A,Int)]) extends T_A[Int]
case class CC_C(a: T_A[T_B[CC_A]], b: (T_A[CC_A],CC_A), c: CC_A) extends T_A[(T_B[Boolean],T_A[Boolean])]
case class CC_D(a: T_A[Int], b: Byte, c: CC_A) extends T_B[CC_A]
case class CC_E(a: CC_D, b: T_B[CC_A], c: T_B[CC_A]) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, _), _, _) => 0 
  case CC_E(_, _, _) => 1 
}
}