package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[G](a: T_A[G, G], b: T_A[T_B[G, G], T_B[G, G]], c: T_B[G, G]) extends T_A[G, T_A[T_A[Int, Char], Char]]
case class CC_C[H](a: T_A[H, T_A[H, H]], b: (T_A[(Char,Byte), Boolean],T_B[Byte, Byte])) extends T_A[H, T_A[T_A[Int, Char], Char]]
case class CC_D[I]() extends T_B[I, CC_C[T_A[Byte, Boolean]]]

val v_a: T_A[Char, T_A[T_A[Int, Char], Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A(), _) => 1 
}
}
// This is not matched: CC_C(CC_A(), (_,_))