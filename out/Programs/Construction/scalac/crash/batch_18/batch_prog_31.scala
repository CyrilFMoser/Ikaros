package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[T_B[Boolean, Char], T_B[Boolean, Boolean]], T_A[T_B[Byte, Int], T_A[Byte, Boolean]]]
case class CC_B[E]() extends T_B[T_A[E, E], E]

val v_a: CC_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}