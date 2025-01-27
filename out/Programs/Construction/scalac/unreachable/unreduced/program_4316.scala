package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[(T_B[Char, Boolean],T_A[(Boolean,Boolean), Int]), T_A[Byte, Char]]
case class CC_B() extends T_A[(T_B[Char, Boolean],T_A[(Boolean,Boolean), Int]), T_A[Byte, Char]]
case class CC_C[G, F](a: T_B[G, F], b: CC_A[F], c: CC_B) extends T_B[F, G]
case class CC_D[I, H](a: T_A[I, I], b: T_B[I, I], c: T_B[I, I]) extends T_B[H, I]
case class CC_E[J](a: (T_B[CC_B, Char],CC_B)) extends T_B[Char, J]

val v_a: T_B[Boolean, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B()) => 0 
  case CC_D(_, CC_D(_, CC_C(_, _, _), _), _) => 1 
  case CC_D(_, CC_D(_, CC_D(_, _, _), _), _) => 2 
}
}
// This is not matched: CC_D(_, CC_C(_, CC_A(), _), _)