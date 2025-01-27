package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, (Char,Char)], (Char,Char)], b: T_A, c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[C]() extends T_B[T_A, C]
case class CC_D[D](a: T_B[D, D]) extends T_B[T_A, D]
case class CC_E[E](a: T_B[T_A, E]) extends T_B[T_A, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_B() => 2 
}
}