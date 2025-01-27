package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: T_A[T_A[T_B]]) extends T_A[T_B]
case class CC_C(a: Boolean, b: Int, c: T_A[CC_B]) extends T_A[T_B]
case class CC_D(a: (Boolean,CC_B)) extends T_B
case class CC_E[B](a: Char, b: B) extends T_B
case class CC_F() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_)