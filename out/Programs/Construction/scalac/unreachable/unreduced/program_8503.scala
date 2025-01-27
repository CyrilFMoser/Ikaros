package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[(Byte,(Char,Byte)), T_B[Int, Boolean]], E]
case class CC_B[F, G](a: T_A[T_B[F, F], CC_A[F]], b: CC_A[F], c: CC_A[F]) extends T_B[F, G]
case class CC_C[H](a: Boolean, b: H) extends T_B[CC_B[H, H], H]

val v_a: T_B[CC_B[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(), CC_A()) => 0 
  case CC_C(_, _) => 1 
}
}