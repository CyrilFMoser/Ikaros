package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_B[E, E], c: E) extends T_A[T_B[T_B[Int, (Boolean,Int)], T_B[Char, Byte]], E]
case class CC_B[F](a: F, b: Int, c: T_A[F, F]) extends T_A[T_B[T_B[Int, (Boolean,Int)], T_B[Char, Byte]], F]

val v_a: T_A[T_B[T_B[Int, (Boolean,Int)], T_B[Char, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(0, _, _) => 1 
  case CC_B(_, _, _) => 2 
}
}