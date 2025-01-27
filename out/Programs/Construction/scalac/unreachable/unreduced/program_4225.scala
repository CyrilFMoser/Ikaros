package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[T_A[Byte, Boolean], T_A[Int, Int]]]
case class CC_B(a: T_A[T_B[Byte], T_A[Int, Char]], b: (Boolean,T_B[Byte]), c: CC_A[Byte]) extends T_A[T_A[((Boolean,Byte),Char), (Int,Byte)], T_A[T_A[Byte, Boolean], T_A[Int, Int]]]
case class CC_C[E]() extends T_A[CC_B, E]
case class CC_D[F](a: (T_A[(Byte,Char), CC_B],T_B[Char])) extends T_B[F]
case class CC_E[G](a: T_B[G]) extends T_B[G]
case class CC_F[H](a: CC_A[H], b: CC_E[H], c: CC_E[H]) extends T_B[H]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D((_,CC_D(_))) => 0 
  case CC_D((_,CC_E(_))) => 1 
  case CC_E(CC_D((_,_))) => 2 
  case CC_E(CC_E(_)) => 3 
  case CC_E(CC_F(_, CC_E(_), _)) => 4 
  case CC_F(_, _, _) => 5 
}
}
// This is not matched: CC_D((_,CC_F(_, _, _)))