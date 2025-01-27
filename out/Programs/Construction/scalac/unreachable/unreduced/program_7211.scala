package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[T_A[Int, Int], T_A[Byte, Byte]]]
case class CC_B(a: CC_A[T_B[Boolean, Char]], b: T_B[T_B[(Boolean,Int), Char], CC_A[(Boolean,Char)]], c: T_B[T_B[Char, Char], T_B[Int, Boolean]]) extends T_A[T_A[T_B[Int, Byte], Int], T_B[T_B[Char, Byte], CC_A[Int]]]
case class CC_C[F](a: CC_A[F], b: T_A[F, F]) extends T_A[F, T_A[T_A[Int, Int], T_A[Byte, Byte]]]

val v_a: T_A[CC_B, T_A[T_A[Int, Int], T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _) => 1 
}
}