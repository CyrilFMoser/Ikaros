package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Byte, b: Int, c: T_A[T_B[(Char,Int), Boolean], T_B[(Char,Char), Char]]) extends T_A[T_A[T_B[Boolean, Int], T_A[Char, Char]], T_A[T_B[Int, Int], Char]]
case class CC_B() extends T_A[T_A[T_B[Boolean, Int], T_A[Char, Char]], T_A[T_B[Int, Int], Char]]
case class CC_C[E, F](a: T_A[F, CC_B], b: CC_A, c: E) extends T_B[E, F]

val v_a: T_A[T_A[T_B[Boolean, Int], T_A[Char, Char]], T_A[T_B[Int, Int], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}