package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[T_B[Byte, Byte], T_A[Char, Char]], T_A[T_A[(Boolean,Boolean), Boolean], Int]]
case class CC_B[F](a: F, b: CC_A[F]) extends T_B[F, CC_A[T_B[Char, Char]]]
case class CC_C[G](a: CC_B[G], b: T_A[G, G], c: (T_B[Char, Boolean],Char)) extends T_B[G, CC_A[T_B[Char, Char]]]
case class CC_D(a: (CC_C[Boolean],CC_C[Boolean])) extends T_B[Boolean, CC_A[T_A[Char, Boolean]]]

val v_a: T_B[T_B[Boolean, CC_A[T_A[Char, Boolean]]], CC_A[T_B[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_D(_), CC_A()) => 0 
  case CC_C(_, _, _) => 1 
}
}