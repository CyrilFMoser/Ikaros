package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[E]() extends T_A[Int, E]
case class CC_B[F](a: T_A[F, Int], b: T_A[Int, F], c: T_A[Int, F]) extends T_A[Int, F]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_B(_, _, _)) => 1 
}
}
// This is not matched: (CC_A Boolean Byte Boolean Wildcard Wildcard Wildcard (T_A Byte Boolean))