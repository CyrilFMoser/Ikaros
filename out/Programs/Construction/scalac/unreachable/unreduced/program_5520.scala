package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[D, D], b: T_B[E]) extends T_A[D, E]
case class CC_B[G, F](a: (Int,T_B[Byte])) extends T_A[F, G]
case class CC_C[H, I](a: (T_A[Int, Int],T_A[Byte, (Byte,Byte)])) extends T_A[H, I]
case class CC_D(a: T_B[Byte], b: T_A[T_B[Boolean], T_A[Char, Int]], c: CC_B[CC_B[Byte, Char], (Int,Boolean)]) extends T_B[T_A[Boolean, CC_C[Byte, Int]]]
case class CC_E(a: CC_B[CC_A[CC_D, Byte], T_B[CC_D]]) extends T_B[T_A[Boolean, CC_C[Byte, Int]]]

val v_a: T_A[Byte, CC_E] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,_)) => 1 
  case CC_C((CC_A(_, _),CC_A(_, _))) => 2 
  case CC_C((CC_A(_, _),CC_B(_))) => 3 
  case CC_C((CC_A(_, _),CC_C(_))) => 4 
  case CC_C((CC_B(_),CC_A(_, _))) => 5 
  case CC_C((CC_B(_),CC_C(_))) => 6 
  case CC_C((CC_C(_),CC_A(_, _))) => 7 
  case CC_C((CC_C(_),CC_B(_))) => 8 
  case CC_C((CC_C(_),CC_C(_))) => 9 
}
}
// This is not matched: CC_C((CC_B(_),CC_B(_)))