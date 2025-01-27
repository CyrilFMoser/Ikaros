package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_B[Byte], T_B[T_B[Byte]]], b: Byte, c: T_B[D]) extends T_A[D, T_B[D]]
case class CC_B[F](a: (T_A[Boolean, Char],T_A[(Byte,Byte), Char])) extends T_A[F, T_B[F]]
case class CC_C[G]() extends T_A[G, T_B[G]]
case class CC_D[H](a: CC_A[H]) extends T_B[H]
case class CC_E[I]() extends T_B[I]

val v_a: T_A[Boolean, T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, 0, CC_D(_)), _, CC_D(_)) => 0 
  case CC_A(CC_A(_, _, CC_D(_)), _, CC_D(_)) => 1 
  case CC_A(CC_A(_, 0, CC_E()), _, CC_D(_)) => 2 
  case CC_A(CC_A(_, _, CC_E()), _, CC_D(_)) => 3 
  case CC_A(CC_B((_,_)), _, CC_D(_)) => 4 
  case CC_A(CC_C(), _, CC_D(_)) => 5 
  case CC_A(CC_A(_, 0, CC_D(_)), _, CC_E()) => 6 
  case CC_A(CC_A(_, _, CC_D(_)), _, CC_E()) => 7 
  case CC_A(CC_A(_, 0, CC_E()), _, CC_E()) => 8 
  case CC_A(CC_A(_, _, CC_E()), _, CC_E()) => 9 
  case CC_A(CC_B((_,_)), _, CC_E()) => 10 
  case CC_A(CC_C(), _, CC_E()) => 11 
  case CC_B((_,_)) => 12 
  case CC_C() => 13 
}
}