package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Char, c: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: Boolean, b: CC_A) extends T_B[T_B[CC_A, T_B[T_A, T_A]], T_B[T_B[CC_A, T_A], CC_A]]
case class CC_C(a: CC_A, b: Char, c: Int) extends T_B[T_B[CC_A, T_B[T_A, T_A]], T_B[T_B[CC_A, T_A], CC_A]]

val v_a: T_B[T_B[CC_A, T_B[T_A, T_A]], T_B[T_B[CC_A, T_A], CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_A(CC_A(_, _, _), _, _), _, _) => 1 
}
}