package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: T_A[B], c: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B(a: T_A[Char], b: Byte, c: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_C() extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_, _, _))) => 1 
  case CC_A(_, _, CC_A(_, _, CC_C())) => 2 
  case CC_A(_, _, CC_B(_, _, _)) => 3 
  case CC_B(_, _, CC_A(_, _, CC_A(_, _, _))) => 4 
  case CC_B(_, _, CC_A(_, _, CC_B(_, _, _))) => 5 
  case CC_B(_, _, CC_A(_, _, CC_C())) => 6 
  case CC_B(_, _, CC_B(_, _, _)) => 7 
  case CC_B(_, _, CC_C()) => 8 
  case CC_C() => 9 
}
}
// This is not matched: CC_A(_, _, CC_C())