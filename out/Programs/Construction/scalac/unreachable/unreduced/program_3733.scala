package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, Boolean]) extends T_A[C, T_A[Char, T_A[Boolean, Byte]]]
case class CC_B[D]() extends T_A[D, T_A[Char, T_A[Boolean, Byte]]]
case class CC_C[E](a: E, b: CC_A[E], c: E) extends T_A[E, T_A[Char, T_A[Boolean, Byte]]]

val v_a: T_A[Int, T_A[Char, T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A(_, _), _) => 2 
}
}