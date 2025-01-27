package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Char],T_A[Char, Int])) extends T_A[Byte, C]
case class CC_B[D](a: T_A[Byte, D], b: T_A[Byte, D], c: CC_A[D]) extends T_A[Byte, D]
case class CC_C[E](a: Byte, b: CC_A[E]) extends T_A[Byte, E]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, CC_A((_,_))) => 2 
}
}