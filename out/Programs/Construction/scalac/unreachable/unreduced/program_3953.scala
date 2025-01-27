package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_B[T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: CC_A, c: Boolean) extends T_A
case class CC_D() extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _), CC_A(_, _), _) => 2 
  case CC_C(CC_C(_, CC_A(_, _), _), CC_A(_, _), _) => 3 
}
}
// This is not matched: CC_C(CC_B(), CC_A(_, _), _)