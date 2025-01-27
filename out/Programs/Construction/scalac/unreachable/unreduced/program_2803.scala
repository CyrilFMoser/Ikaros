package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Byte]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, Byte]
case class CC_C[E]() extends T_A[E, Byte]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}