package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_B(a: CC_A, b: Int, c: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_C(a: T_A[T_A[Char]], b: Byte, c: T_A[CC_A]) extends T_A[T_A[Char]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B(_, _, CC_A(_))) => 3 
  case CC_A(CC_B(_, _, CC_B(_, _, _))) => 4 
  case CC_A(CC_B(_, _, CC_C(_, _, _))) => 5 
  case CC_A(CC_C(_, _, _)) => 6 
}
}