package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(Boolean,T_A)]) extends T_A
case class CC_B(a: T_B[T_B[T_A]]) extends T_B[T_B[T_A]]
case class CC_C() extends T_B[T_B[T_A]]
case class CC_D(a: T_A) extends T_B[T_B[T_A]]

val v_a: T_B[T_B[T_A]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_)) => 1 
}
}
// This is not matched: CC_B(_)