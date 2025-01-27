package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: Byte, b: T_B[T_A, C]) extends T_B[T_A, C]
case class CC_C[D](a: T_B[D, D], b: (T_B[T_A, Char],Char), c: Char) extends T_B[T_A, D]
case class CC_D[E](a: E, b: E, c: T_B[T_A, E]) extends T_B[T_A, E]

val v_a: T_B[T_A, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
  case CC_B(_, CC_C(_, _, _)) => 1 
  case CC_B(_, CC_D(_, _, CC_B(_, _))) => 2 
  case CC_B(_, CC_D(_, _, CC_C(_, _, _))) => 3 
  case CC_C(_, _, 'x') => 4 
  case CC_C(_, _, _) => 5 
  case CC_D(_, _, _) => 6 
}
}
// This is not matched: CC_B(_, CC_D(_, _, CC_D(_, _, _)))