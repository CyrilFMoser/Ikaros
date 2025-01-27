package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A
case class CC_C(a: CC_B, b: CC_B) extends T_A
case class CC_D() extends T_B[Int]
case class CC_E(a: CC_B) extends T_B[Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
  case CC_B(CC_C(_, _), _) => 3 
}
}
// This is not matched: CC_C(_, _)