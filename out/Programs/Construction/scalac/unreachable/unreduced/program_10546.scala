package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: Char, c: (T_A[Byte, Boolean],T_A[Char, Byte])) extends T_A[C, (T_A[Int, Char],T_A[Boolean, Byte])]
case class CC_B[D]() extends T_A[D, CC_A[D]]
case class CC_C[E](a: T_A[E, CC_A[E]]) extends T_A[E, (T_A[Int, Char],T_A[Boolean, Byte])]

val v_a: T_A[Byte, (T_A[Int, Char],T_A[Boolean, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_C(CC_B()) => 1 
}
}