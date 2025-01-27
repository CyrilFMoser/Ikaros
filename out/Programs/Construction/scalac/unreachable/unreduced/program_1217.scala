package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[E, E], c: Boolean) extends T_A[Char, E]
case class CC_B[F]() extends T_A[Char, F]
case class CC_C[H, G](a: T_B[G, G], b: T_A[Char, G]) extends T_B[H, G]
case class CC_D[I](a: Char, b: Int) extends T_B[I, Char]
case class CC_E[J](a: Byte, b: (CC_A[Boolean],T_A[Byte, Byte])) extends T_B[J, Char]

val v_a: T_B[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _), CC_A(_, _, _)) => 0 
  case CC_C(CC_D(_, _), CC_A(_, _, _)) => 1 
  case CC_C(CC_D(_, _), CC_B()) => 2 
  case CC_C(CC_E(_, _), CC_A(_, _, _)) => 3 
  case CC_C(CC_E(_, _), CC_B()) => 4 
  case CC_D(_, _) => 5 
  case CC_E(_, (_,_)) => 6 
}
}
// This is not matched: CC_C(CC_C(_, _), CC_B())