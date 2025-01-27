package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[Boolean, D]
case class CC_B[E](a: E, b: T_A[E, E], c: T_B[E]) extends T_A[Boolean, E]
case class CC_C(a: Boolean, b: T_A[Boolean, Char], c: T_A[T_A[(Byte,Char), Char], (Byte,Char)]) extends T_A[Boolean, T_A[Boolean, T_A[Boolean, Byte]]]

val v_a: T_A[Boolean, T_A[Boolean, T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_B(CC_B(_, _, _), _, _) => 2 
  case CC_C(_, CC_A(), _) => 3 
  case CC_C(_, CC_B(_, _, _), _) => 4 
}
}