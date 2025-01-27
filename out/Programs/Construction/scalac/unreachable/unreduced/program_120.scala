package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: E) extends T_A[T_A[E, E], E]
case class CC_B() extends T_A[T_A[T_A[Char, T_A[Boolean, Byte]], T_A[Char, T_A[Boolean, Byte]]], T_A[Char, T_A[Boolean, Byte]]]

val v_a: CC_A[T_A[T_A[T_A[Char, T_A[Boolean, Byte]], T_A[Char, T_A[Boolean, Byte]]], T_A[Char, T_A[Boolean, Byte]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B()) => 1 
}
}