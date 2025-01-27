package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[(Boolean,Byte), (Byte,Byte)], E]
case class CC_B[F](a: Byte, b: T_A[F, F]) extends T_A[T_B[(Boolean,Byte), (Byte,Byte)], F]

val v_a: T_A[T_B[(Boolean,Byte), (Byte,Byte)], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}