package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[F, E](a: E, b: (CC_A[(Byte,Boolean), Byte],CC_A[Byte, Int]), c: T_A[E, F]) extends T_A[F, E]

val v_a: CC_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}