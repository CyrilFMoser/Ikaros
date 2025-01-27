package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Char]], b: Int) extends T_A[Char]
case class CC_B(a: T_A[Char], b: Char) extends T_A[Char]
case class CC_C(a: T_A[T_A[Int]], b: CC_B, c: T_A[Char]) extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, 'x') => 1 
  case CC_B(_, _) => 2 
}
}