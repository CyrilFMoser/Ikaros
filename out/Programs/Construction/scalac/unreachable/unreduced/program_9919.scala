package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: Char, b: T_A[E, E]) extends T_A[F, E]
case class CC_B[G, H](a: Int, b: T_B[H, G], c: T_A[G, H]) extends T_A[H, G]
case class CC_C[I, J](a: J, b: T_A[I, J]) extends T_A[I, J]
case class CC_D[K](a: T_A[K, K]) extends T_B[T_A[CC_C[Char, Char], CC_A[(Boolean,Byte), Boolean]], K]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _))) => 1 
  case CC_A(_, CC_A(_, CC_C(_, _))) => 2 
  case CC_A(_, CC_B(_, _, _)) => 3 
  case CC_A(_, CC_C(_, _)) => 4 
  case CC_C(_, _) => 5 
}
}
// This is not matched: CC_B(_, _, _)