package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A], b: T_B[T_B[T_A]], c: T_B[T_A]) extends T_A
case class CC_C(a: T_A, b: CC_A, c: T_B[T_A]) extends T_B[T_A]
case class CC_D(a: T_B[CC_A], b: CC_C) extends T_B[T_A]
case class CC_E(a: Char, b: (T_B[CC_A],CC_D)) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}