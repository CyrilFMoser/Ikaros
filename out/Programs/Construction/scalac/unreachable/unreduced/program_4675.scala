package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: T_B[T_B[(Byte,Boolean)]], c: T_A) extends T_A
case class CC_B(a: T_B[T_A]) extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_C, b: Int, c: T_A) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)