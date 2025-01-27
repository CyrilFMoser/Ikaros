package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Char], b: T_A[Int], c: T_B[Byte]) extends T_A[T_B[T_B[Byte]]]
case class CC_B(a: Byte) extends T_B[(CC_A,T_B[CC_A])]
case class CC_C(a: CC_B, b: CC_B, c: CC_A) extends T_B[(CC_A,T_B[CC_A])]
case class CC_D(a: T_B[Int]) extends T_B[(CC_A,T_B[CC_A])]

val v_a: T_B[(CC_A,T_B[CC_A])] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_B(_)