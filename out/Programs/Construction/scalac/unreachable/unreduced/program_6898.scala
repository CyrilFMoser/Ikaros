package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Boolean], (Char,(Boolean,Char))], b: (T_B[Byte, Byte],Char)) extends T_A[T_B[T_B[(Boolean,Byte), Boolean], T_B[(Char,Boolean), Byte]]]
case class CC_B[D, E](a: T_A[(CC_A,CC_A)], b: E) extends T_B[D, E]
case class CC_C[F, G](a: T_B[G, F]) extends T_B[F, G]
case class CC_D[H](a: T_A[H], b: Boolean) extends T_B[CC_B[T_A[CC_A], CC_C[CC_A, CC_A]], H]

val v_a: T_B[CC_B[T_A[CC_A], CC_C[CC_A, CC_A]], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_B(_, CC_B(_, _))) => 1 
  case CC_C(CC_C(CC_B(_, _))) => 2 
  case CC_C(CC_C(CC_C(_))) => 3 
  case CC_C(CC_C(CC_D(_, _))) => 4 
  case CC_D(_, _) => 5 
}
}