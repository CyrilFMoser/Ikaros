package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[F, E], b: Boolean, c: T_A[T_B[T_B[Boolean, Char], Char], T_B[Byte, Byte]]) extends T_A[F, E]
case class CC_B[I](a: (T_B[Char, Int],T_B[Boolean, Int])) extends T_B[I, T_A[I, I]]
case class CC_C[J](a: CC_A[J, J], b: T_A[J, J]) extends T_B[J, T_A[J, J]]

val v_a: T_B[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_B((_,_)) => 0 
  case CC_C(_, _) => 1 
}
}