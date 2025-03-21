package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, (Boolean,Char)], c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C() extends T_A[Int, T_A[Int, Int]]

val v_a: T_A[T_A[Int, T_A[Int, Int]], T_A[T_A[Int, T_A[Int, Int]], T_A[Int, T_A[Int, Int]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 0 
  case CC_A(CC_A(_, _, _), _, CC_B()) => 1 
  case CC_A(CC_B(), _, CC_B()) => 2 
  case CC_B() => 3 
}
}
// This is not matched: CC_A(CC_B(), _, CC_A(_, _, _))