package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D(a: T_B[(CC_A,CC_A)]) extends T_B[Boolean]
case class CC_E(a: CC_A, b: T_B[T_B[Boolean]], c: T_B[T_A]) extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(CC_B()) => 1 
}
}
// This is not matched: CC_B()