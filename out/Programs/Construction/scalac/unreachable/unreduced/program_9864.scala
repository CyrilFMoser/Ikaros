package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(T_A,T_A)], b: T_A, c: T_B[Byte]) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C(a: T_B[CC_B]) extends T_B[CC_B]
case class CC_D(a: Boolean, b: T_B[T_B[CC_B]]) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_))) => 0 
  case CC_C(CC_C(CC_D(_, _))) => 1 
  case CC_C(CC_D(_, _)) => 2 
}
}
// This is not matched: CC_D(_, _)