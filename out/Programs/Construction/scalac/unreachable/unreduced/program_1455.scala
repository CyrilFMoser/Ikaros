package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[(Boolean,Boolean)], c: T_A[D]) extends T_A[D]
case class CC_B[E](a: (T_A[Boolean],T_B[Byte, (Int,Byte)])) extends T_A[E]
case class CC_C[F](a: T_A[F]) extends T_A[F]
case class CC_D[G](a: T_A[G], b: T_A[G]) extends T_B[CC_C[G], G]
case class CC_E[H]() extends T_B[CC_C[H], H]
case class CC_F[I](a: (Boolean,T_B[Byte, Byte])) extends T_B[CC_C[I], I]

val v_a: T_B[CC_C[Char], Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_D(CC_A(_, _, _), CC_B(_)) => 1 
  case CC_D(CC_A(_, _, _), CC_C(_)) => 2 
  case CC_D(CC_B(_), CC_A(_, _, _)) => 3 
  case CC_D(CC_B(_), CC_B(_)) => 4 
  case CC_D(CC_B(_), CC_C(_)) => 5 
  case CC_D(CC_C(_), CC_A(_, _, _)) => 6 
  case CC_D(CC_C(_), CC_B(_)) => 7 
  case CC_D(CC_C(_), CC_C(_)) => 8 
  case CC_E() => 9 
  case CC_F((_,_)) => 10 
}
}