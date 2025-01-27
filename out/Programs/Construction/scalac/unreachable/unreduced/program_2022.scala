package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[D], b: Boolean, c: T_B[D]) extends T_A[E, D]
case class CC_B[F, G](a: T_A[G, G]) extends T_A[F, G]
case class CC_C[H, I](a: (T_A[Boolean, Char],T_A[Byte, Int]), b: T_A[I, I], c: (T_A[Byte, Int],Byte)) extends T_A[H, I]
case class CC_D() extends T_B[CC_A[CC_C[Boolean, Byte], T_A[Char, Char]]]
case class CC_E(a: CC_C[CC_A[(Int,Boolean), CC_D], CC_A[CC_D, CC_D]], b: T_A[T_B[CC_D], T_A[CC_D, CC_D]]) extends T_B[CC_A[CC_C[Boolean, Byte], T_A[Char, Char]]]
case class CC_F(a: T_A[Char, CC_A[(Boolean,Boolean), CC_E]], b: CC_E) extends T_B[CC_A[CC_C[Boolean, Byte], T_A[Char, Char]]]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_B(CC_B(CC_A(_, _, _))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
  case CC_B(CC_B(CC_C(_, _, _))) => 4 
  case CC_B(CC_C(_, _, _)) => 5 
  case CC_C(_, _, _) => 6 
}
}