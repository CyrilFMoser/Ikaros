package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[Char, T_A], T_A]) extends T_A
case class CC_B(a: Boolean, b: (T_A,CC_A)) extends T_B[CC_A, T_B[(CC_A,CC_A), T_A]]
case class CC_C(a: T_B[CC_B, T_A]) extends T_B[CC_A, T_B[(CC_A,CC_A), T_A]]
case class CC_D() extends T_B[CC_A, T_B[(CC_A,CC_A), T_A]]

val v_a: T_B[CC_A, T_B[(CC_A,CC_A), T_A]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_D()