package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Byte, b: E) extends T_A[T_B[E, E], E]
case class CC_B[F]() extends T_B[Boolean, F]
case class CC_C[G](a: (T_B[Int, (Byte,Byte)],T_B[Boolean, Byte])) extends T_B[Boolean, G]

val v_a: T_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((_,CC_C(_))) => 1 
}
}
// This is not matched: CC_C((_,CC_B()))