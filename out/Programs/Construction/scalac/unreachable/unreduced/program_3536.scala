package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Boolean]], b: T_B) extends T_A[T_A[Boolean]]
case class CC_B(a: CC_A) extends T_A[T_A[Boolean]]
case class CC_C(a: T_B) extends T_A[T_A[Boolean]]
case class CC_D(a: Char, b: T_B, c: Boolean) extends T_B
case class CC_E(a: CC_D) extends T_B
case class CC_F(a: T_A[T_B], b: CC_D, c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(CC_D(_, _, _)) => 0 
  case CC_F(_, _, _) => 1 
}
}
// This is not matched: CC_D(_, _, _)