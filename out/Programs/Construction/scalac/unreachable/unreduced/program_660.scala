package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[(T_A[Byte, Char],T_B[Byte, Byte]), E]
case class CC_B[F](a: Byte, b: CC_A[F], c: T_A[F, (Boolean,(Char,Byte))]) extends T_A[(T_A[Byte, Char],T_B[Byte, Byte]), F]
case class CC_C[G]() extends T_B[CC_B[CC_B[Int]], G]

val v_a: T_A[(T_A[Byte, Char],T_B[Byte, Byte]), Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
}
}