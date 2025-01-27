package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: Int) extends T_A
case class CC_B(a: T_B[Char], b: T_B[T_B[T_A]], c: Boolean) extends T_B[Char]
case class CC_C[B](a: T_B[Char]) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _)) => 0 
  case CC_C(CC_C(_)) => 1 
}
}
// This is not matched: CC_B(_, _, _)