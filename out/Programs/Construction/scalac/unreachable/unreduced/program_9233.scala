package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Char], T_A[Char]], b: T_B[T_A[Boolean], T_B[Int, Int]], c: T_B[T_B[Int, Char], T_B[Boolean, Byte]]) extends T_A[T_B[T_B[(Int,Boolean), Int], T_A[Char]]]
case class CC_B(a: T_B[T_B[CC_A, (Int,Int)], Boolean]) extends T_A[T_B[T_B[(Int,Boolean), Int], T_A[Char]]]
case class CC_C[D](a: T_A[D], b: CC_B) extends T_A[T_B[T_B[(Int,Boolean), Int], T_A[Char]]]
case class CC_D[E](a: CC_A, b: E, c: T_A[E]) extends T_B[(Boolean,T_A[CC_A]), E]
case class CC_E[F]() extends T_B[(Boolean,T_A[CC_A]), F]

val v_a: T_B[(Boolean,T_A[CC_A]), T_A[T_B[T_B[(Int,Boolean), Int], T_A[Char]]]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_, _, _), _) => 0 
  case CC_D(_, CC_B(_), _) => 1 
  case CC_D(_, CC_C(_, CC_B(_)), _) => 2 
  case CC_E() => 3 
}
}