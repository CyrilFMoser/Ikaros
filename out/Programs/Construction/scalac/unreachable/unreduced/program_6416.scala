package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Byte]
case class CC_B(a: (T_A[Byte],T_B[CC_A]), b: T_A[T_B[CC_A]], c: T_A[Byte]) extends T_A[Byte]
case class CC_C(a: (T_A[Byte],T_B[CC_A])) extends T_A[Byte]
case class CC_D[C](a: CC_C) extends T_B[C]
case class CC_E[D](a: Int, b: CC_D[D]) extends T_B[D]
case class CC_F[E](a: (CC_A,T_B[CC_B]), b: E, c: CC_C) extends T_B[E]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(),CC_D(_)), _, _) => 0 
  case CC_B((CC_A(),CC_E(_, _)), _, _) => 1 
  case CC_B((CC_A(),CC_F(_, _, _)), _, _) => 2 
  case CC_B((CC_B(_, _, _),CC_D(_)), _, _) => 3 
  case CC_B((CC_B(_, _, _),CC_E(_, _)), _, _) => 4 
  case CC_B((CC_B(_, _, _),CC_F(_, _, _)), _, _) => 5 
  case CC_B((CC_C(_),CC_D(_)), _, _) => 6 
  case CC_B((CC_C(_),CC_E(_, _)), _, _) => 7 
  case CC_B((CC_C(_),CC_F(_, _, _)), _, _) => 8 
  case CC_C((CC_A(),CC_D(_))) => 9 
  case CC_C((CC_A(),CC_E(_, _))) => 10 
  case CC_C((CC_A(),CC_F(_, _, _))) => 11 
  case CC_C((CC_B(_, _, _),CC_D(_))) => 12 
  case CC_C((CC_B(_, _, _),CC_E(_, _))) => 13 
  case CC_C((CC_B(_, _, _),CC_F(_, _, _))) => 14 
  case CC_C((CC_C(_),CC_D(_))) => 15 
  case CC_C((CC_C(_),CC_E(_, _))) => 16 
  case CC_C((CC_C(_),CC_F(_, _, _))) => 17 
}
}
// This is not matched: CC_A()