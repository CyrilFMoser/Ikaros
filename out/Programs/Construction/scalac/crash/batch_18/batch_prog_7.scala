package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[C, C], b: T_A[D, T_A[T_A[(Byte,Int), D], D]], c: T_A[C, D]) extends T_A[C, D]
case class CC_B[F]() extends T_A[T_A[T_A[Int, Char], T_A[Byte, Boolean]], F]
case class CC_C[G](a: T_A[G, G], b: CC_B[G]) extends T_A[T_A[T_A[Int, Char], T_A[Byte, Boolean]], G]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
}
}