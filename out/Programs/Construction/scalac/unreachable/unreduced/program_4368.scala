package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: T_B, b: T_A[Char]) extends T_A[T_B]
case class CC_C(a: CC_B) extends T_B
case class CC_D() extends T_B
case class CC_E(a: CC_D, b: T_A[T_B]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_D(), _) => 1 
  case CC_B(CC_E(CC_D(), _), _) => 2 
}
}
// This is not matched: CC_B(CC_C(_), _)