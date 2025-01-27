package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Boolean, c: T_B[E, E]) extends T_A[T_B[T_A[Char, Boolean], T_A[Int, Byte]], E]
case class CC_B[F](a: (CC_A[Byte],T_A[Char, (Char,Int)])) extends T_A[T_B[T_A[Char, Boolean], T_A[Int, Byte]], F]
case class CC_C(a: CC_B[CC_A[Int]]) extends T_A[T_B[T_A[Char, Boolean], T_A[Int, Byte]], CC_B[CC_A[Char]]]

val v_a: T_A[T_B[T_A[Char, Boolean], T_A[Int, Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((CC_A(_, _, _),_)) => 1 
}
}