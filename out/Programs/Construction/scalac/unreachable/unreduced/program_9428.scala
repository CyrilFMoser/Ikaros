package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_A, c: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: T_B[T_B[T_A]]) extends T_A
case class CC_C(a: Boolean, b: T_B[Char]) extends T_A
case class CC_D(a: CC_C, b: T_A, c: CC_C) extends T_B[Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(true, _) => 1 
  case CC_C(false, _) => 2 
}
}
// This is not matched: CC_A(_, _, _)