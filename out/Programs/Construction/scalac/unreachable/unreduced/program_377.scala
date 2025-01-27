package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A]) extends T_A
case class CC_B(a: T_B[T_A], b: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: T_B[CC_A], b: T_B[T_B[T_A]], c: CC_A) extends T_B[T_B[T_A]]
case class CC_E() extends T_B[T_B[T_A]]
case class CC_F() extends T_B[T_B[T_A]]

val v_a: T_B[T_B[T_A]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_F()