package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[D, T_B[D]], c: T_B[D]) extends T_A[D, T_A[T_A[Byte, Char], T_A[Boolean, Int]]]
case class CC_B[E]() extends T_A[E, T_A[T_A[Byte, Char], T_A[Boolean, Int]]]

val v_a: T_A[Char, T_A[T_A[Byte, Char], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}