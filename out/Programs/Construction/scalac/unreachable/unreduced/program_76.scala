package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Char]], b: Int, c: T_A[T_A[Char]]) extends T_A[T_B[T_B[Boolean, (Int,Char)], T_A[Byte]]]
case class CC_B(a: T_B[CC_A, T_A[CC_A]], b: CC_A) extends T_A[T_B[T_B[Boolean, (Int,Char)], T_A[Byte]]]
case class CC_C[E, D](a: D, b: CC_A, c: (CC_B,CC_A)) extends T_B[D, E]
case class CC_D[G, F]() extends T_B[G, F]
case class CC_E[I, H](a: T_B[H, I], b: (CC_D[Char, (Boolean,Int)],T_B[Char, (Char,Char)]), c: (Byte,CC_B)) extends T_B[I, H]

val v_a: T_A[T_B[T_B[Boolean, (Int,Char)], T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(CC_C(_, _, _), _) => 2 
  case CC_B(CC_D(), _) => 3 
}
}
// This is not matched: CC_B(CC_E(_, _, _), _)