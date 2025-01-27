package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: T_B[T_B[Char]]) extends T_A[T_A[T_B[Boolean]]]
case class CC_C() extends T_A[T_A[T_B[Boolean]]]
case class CC_D(a: Char) extends T_B[((CC_B,CC_B),(CC_B,Int))]
case class CC_E(a: CC_C, b: CC_D) extends T_B[((CC_B,CC_B),(CC_B,Int))]
case class CC_F[D](a: CC_E, b: CC_B, c: CC_D) extends T_B[((CC_B,CC_B),(CC_B,Int))]

val v_a: T_B[((CC_B,CC_B),(CC_B,Int))] = null
val v_b: Int = v_a match{
  case CC_E(CC_C(), CC_D(_)) => 0 
  case CC_F(CC_E(CC_C(), CC_D(_)), CC_B(_), _) => 1 
}
}
// This is not matched: CC_D(_)