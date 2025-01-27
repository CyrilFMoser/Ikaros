package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: Int, c: T_A[T_A[Int]]) extends T_A[T_A[Byte]]
case class CC_B(a: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_C() extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, 12, _)) => 1 
  case CC_B(CC_B(CC_A(_, _, _))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
  case CC_B(CC_B(CC_C())) => 4 
  case CC_B(CC_C()) => 5 
  case CC_C() => 6 
}
}
// This is not matched: CC_B(CC_A(_, _, _))