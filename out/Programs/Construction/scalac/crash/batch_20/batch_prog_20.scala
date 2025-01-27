package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[D, C]
case class CC_B[F, E]() extends T_A[F, E]
case class CC_C[G](a: Byte) extends T_A[G, CC_A[G, G]]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
}
}