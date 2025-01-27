package Program_63 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_D(a: T_B[T_A], b: T_B[T_B[T_A]]) extends T_B[T_A]
case class CC_E() extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_E(), _) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_B(_, _)