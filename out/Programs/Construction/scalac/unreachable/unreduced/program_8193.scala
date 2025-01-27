package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[Char, D]
case class CC_B(a: T_A[Char, T_B[Boolean]], b: T_A[T_A[Char, (Byte,Boolean)], T_B[Char]]) extends T_A[Char, T_B[T_A[Boolean, Char]]]
case class CC_C[F](a: T_A[Char, F]) extends T_B[F]
case class CC_D[G](a: (T_A[CC_B, CC_B],CC_C[CC_B])) extends T_B[G]
case class CC_E() extends T_B[T_A[CC_B, CC_B]]

val v_a: T_B[CC_E] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
  case CC_D((_,CC_C(_))) => 1 
}
}