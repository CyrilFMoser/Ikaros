package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[G, H]() extends T_A[G, H]
case class CC_C[I](a: I, b: T_A[I, I], c: I) extends T_B[T_A[I, I], I]
case class CC_D(a: T_B[CC_B[Boolean, Char], CC_C[Boolean]], b: CC_B[T_A[Boolean, (Byte,Char)], Byte]) extends T_B[(T_A[(Char,Int), Int],CC_C[Char]), T_A[Int, CC_A[Boolean, (Boolean,Boolean)]]]
case class CC_E[J]() extends T_B[T_A[J, J], J]

val v_a: T_B[T_A[CC_D, CC_D], CC_D] = null
val v_b: Int = v_a match{
  case CC_C(CC_D(_, CC_B()), CC_A(), CC_D(_, CC_B())) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_C(CC_D(_, CC_B()), CC_B(), CC_D(_, CC_B()))