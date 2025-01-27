package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_A[Byte]], c: T_A[Char]) extends T_A[Char]
case class CC_B(a: Byte, b: T_A[Char], c: Byte) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _), _) => 1 
  case CC_B(_, CC_B(_, _, _), _) => 2 
}
}