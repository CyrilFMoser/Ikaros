package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[T_A[Char, Char], Byte], C]
case class CC_B[E](a: T_A[E, E], b: T_A[E, E], c: Int) extends T_A[T_A[T_A[Char, Char], Byte], E]
case class CC_C() extends T_A[T_A[T_A[Char, Char], Byte], CC_A[Boolean, CC_B[Char]]]

val v_a: T_A[T_A[T_A[Char, Char], Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}