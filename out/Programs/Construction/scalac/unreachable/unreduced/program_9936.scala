package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: Int) extends T_A[T_B]
case class CC_C(a: CC_B) extends T_B
case class CC_D(a: T_A[(CC_B,CC_A)], b: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(12)) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_C(CC_B(_))