package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[T_A],T_B[T_A]), b: T_B[T_A]) extends T_A
case class CC_B(a: T_A, b: Char, c: T_B[Char]) extends T_A
case class CC_C() extends T_A
case class CC_D(a: Int, b: T_B[CC_C]) extends T_B[T_B[CC_A]]
case class CC_E(a: Int, b: Byte, c: Boolean) extends T_B[T_B[CC_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}