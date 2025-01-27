package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[Char, T_A[Boolean, Byte]], E]
case class CC_B(a: T_A[T_A[Int, Int], CC_A[Boolean]], b: Boolean, c: Int) extends T_A[T_B[Char, T_A[Boolean, Byte]], (Byte,Boolean)]
case class CC_C() extends T_A[T_B[Char, T_A[Boolean, Byte]], (Byte,Boolean)]

val v_a: T_A[T_B[Char, T_A[Boolean, Byte]], (Byte,Boolean)] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()