package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[Byte, E]
case class CC_B[F](a: F, b: T_A[Byte, F]) extends T_A[Byte, F]
case class CC_C(a: CC_B[T_A[Byte, Byte]]) extends T_A[Byte, T_A[T_B[(Boolean,Boolean), Byte], T_A[Byte, Int]]]
case class CC_D[H, G](a: T_A[H, H], b: T_A[H, H], c: T_A[G, H]) extends T_B[H, G]

val v_a: T_A[Byte, T_A[T_B[(Boolean,Boolean), Byte], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, CC_A())) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 3 
  case CC_B(_, CC_B(_, CC_C(_))) => 4 
  case CC_B(_, CC_C(CC_B(_, _))) => 5 
  case CC_C(_) => 6 
}
}