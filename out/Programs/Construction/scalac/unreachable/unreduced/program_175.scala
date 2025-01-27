package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_A[Boolean, Int]]) extends T_A[E, T_A[Boolean, Int]]
case class CC_B[F](a: T_A[F, F], b: Int, c: Byte) extends T_A[F, T_A[Boolean, Int]]
case class CC_C[G](a: T_A[G, T_A[Boolean, Int]], b: Char) extends T_B[Byte, G]

val v_a: T_A[Boolean, T_A[Boolean, Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_B(_, _, 0) => 2 
  case CC_B(_, _, _) => 3 
}
}