package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[T_B[Char, Boolean], T_B[Int, Int]], E]
case class CC_B[F](a: T_A[F, T_A[F, F]]) extends T_B[F, T_B[(Boolean,Byte), T_B[F, F]]]
case class CC_C[G]() extends T_B[G, T_B[(Boolean,Byte), T_B[G, G]]]

val v_a: T_B[Boolean, T_B[(Boolean,Byte), T_B[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}