package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[Int, T_A[Int, T_A[Char, Byte]]]) extends T_A[Int, C]
case class CC_B[E](a: T_A[Int, E]) extends T_A[Int, E]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, CC_A(_, _, _))) => 1 
  case CC_B(CC_A(_, _, CC_B(_))) => 2 
  case CC_B(CC_B(_)) => 3 
}
}