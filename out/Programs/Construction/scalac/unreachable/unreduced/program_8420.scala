package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_B[Boolean], b: CC_A) extends T_B[T_A]
case class CC_C(a: Char) extends T_B[T_A]
case class CC_D() extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_D()