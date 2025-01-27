package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B, b: T_A[B], c: B) extends T_A[B]
case class CC_B(a: Char, b: Int) extends T_A[T_A[Boolean]]
case class CC_C[C](a: T_B, b: C) extends T_A[C]
case class CC_D[D](a: T_B, b: D) extends T_B
case class CC_E(a: CC_A[Byte]) extends T_B
case class CC_F(a: CC_D[CC_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
}
}
// This is not matched: (CC_E Wildcard T_B)