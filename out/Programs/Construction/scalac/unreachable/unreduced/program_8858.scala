package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: (T_A[Byte, Char],T_A[Byte, Char]), c: T_A[C, Char]) extends T_A[C, Char]
case class CC_B[D]() extends T_A[D, Char]
case class CC_C(a: T_A[CC_A[Int], Char]) extends T_A[Byte, T_A[T_A[Byte, Byte], Char]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, (_,_), CC_A(_, _, _))) => 0 
  case CC_C(CC_A(_, (_,_), CC_B())) => 1 
  case CC_C(CC_B()) => 2 
}
}