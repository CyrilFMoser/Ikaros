package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: (T_A[Byte, Char],T_B[Boolean, Char]), b: (T_B[Char, Int],Boolean)) extends T_A[F, E]
case class CC_B[G, H](a: T_A[H, G], b: T_A[G, G], c: T_B[H, G]) extends T_A[H, G]
case class CC_C[I](a: I, b: CC_A[I, I]) extends T_A[(Boolean,T_A[Boolean, Boolean]), I]
case class CC_D[J](a: Char) extends T_B[J, (CC_B[Boolean, Boolean],CC_C[Char])]

val v_a: T_A[(Boolean,T_A[Boolean, Boolean]), Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,true)) => 0 
  case CC_A(_, (_,false)) => 1 
  case CC_B(CC_A((_,_), (_,_)), _, _) => 2 
  case CC_B(CC_B(CC_A(_, _), CC_A(_, _), _), _, _) => 3 
  case CC_B(CC_B(CC_A(_, _), CC_B(_, _, _), _), _, _) => 4 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_, _), _), _, _) => 5 
  case CC_B(CC_B(CC_B(_, _, _), CC_B(_, _, _), _), _, _) => 6 
  case CC_B(CC_B(CC_C(_, _), CC_B(_, _, _), _), _, _) => 7 
  case CC_B(CC_C(_, _), _, _) => 8 
  case CC_C(_, _) => 9 
}
}
// This is not matched: CC_B(CC_B(CC_C(_, _), CC_A(_, _), _), _, _)