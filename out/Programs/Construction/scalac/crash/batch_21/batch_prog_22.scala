package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[Boolean, E], b: E) extends T_A[E, T_A[T_A[(Boolean,Int), Int], T_A[Int, Char]]]
case class CC_B[F](a: F, b: Int, c: T_B[F, F]) extends T_B[T_A[Int, T_B[Boolean, (Char,Char)]], F]

val v_a: T_B[T_A[Int, T_B[Boolean, (Char,Char)]], Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
}
}