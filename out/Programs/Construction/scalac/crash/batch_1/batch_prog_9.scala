package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: T_A, c: T_B[T_A]) extends T_A
case class CC_B(a: T_B[CC_A], b: Char) extends T_B[T_B[T_B[CC_A]]]
case class CC_C() extends T_B[T_B[T_B[CC_A]]]
case class CC_D() extends T_B[T_B[T_B[CC_A]]]

val v_a: T_B[T_B[T_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_B(_, _)