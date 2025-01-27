package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Char],T_A[Char, Byte])) extends T_A[Char, C]
case class CC_B[D, E](a: E, b: T_A[Char, D]) extends T_A[Char, D]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A((_,_))) => 0 
  case CC_B(_, CC_B(_, _)) => 1 
}
}
// This is not matched: CC_A(_)