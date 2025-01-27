package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_B[T_B[T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Int, b: CC_A, c: T_B[Int]) extends T_A
case class CC_D(a: CC_B, b: Int, c: CC_C) extends T_B[Char]
case class CC_E() extends T_B[Char]
case class CC_F(a: Boolean) extends T_B[Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, _)