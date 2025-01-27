package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[Byte, C]]
case class CC_B[D](a: (T_A[Boolean, Int],CC_A[Char])) extends T_A[D, T_A[Byte, D]]
case class CC_C[E]() extends T_A[E, T_A[Byte, E]]

val v_a: T_A[Boolean, T_A[Byte, Boolean]] = null
val v_b: Int = v_a match{
  case CC_B((_,CC_A())) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()