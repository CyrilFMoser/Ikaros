package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[E, E]) extends T_A[T_A[(Int,Boolean), T_A[Byte, Int]], E]
case class CC_B(a: T_B[T_B[Char, Boolean], Boolean]) extends T_A[T_A[(Int,Boolean), T_A[Byte, Int]], Int]
case class CC_C[F, G]() extends T_A[G, F]
case class CC_D(a: T_A[Char, CC_B], b: CC_B, c: CC_B) extends T_B[CC_B, (T_B[CC_B, CC_B],Byte)]

val v_a: T_A[T_A[(Int,Boolean), T_A[Byte, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C()) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}