package Program_63 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_B[(Char,Boolean)]]) extends T_A
case class CC_C(a: CC_A, b: CC_A) extends T_A
case class CC_E() extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, CC_A(CC_A(_, _), _)) => 1 
}
}
// This is not matched: CC_A(_, _, _)