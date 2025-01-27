package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Boolean]) extends T_A
case class CC_B(a: T_B[Char, T_A]) extends T_A
case class CC_C(a: CC_B, b: Int, c: CC_B) extends T_A
case class CC_D(a: T_A, b: T_B[T_B[T_A, CC_B], Int]) extends T_B[CC_C, Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_)