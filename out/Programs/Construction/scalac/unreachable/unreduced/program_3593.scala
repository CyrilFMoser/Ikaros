package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: E, c: E) extends T_A[T_B[T_B[Boolean, Boolean], T_B[Byte, Char]], E]
case class CC_B(a: ((Boolean,Char),T_A[Int, Char]), b: (T_B[Char, Byte],(Byte,Int))) extends T_A[T_B[T_B[Boolean, Boolean], T_B[Byte, Char]], CC_A[Boolean]]
case class CC_C(a: Int, b: CC_B) extends T_A[T_B[T_B[Boolean, Boolean], T_B[Byte, Char]], CC_A[Boolean]]
case class CC_D[G, F](a: Byte, b: (Char,T_B[Char, Boolean])) extends T_B[G, F]
case class CC_E[I, H](a: T_B[H, H]) extends T_B[I, H]

val v_a: T_A[T_B[T_B[Boolean, Boolean], T_B[Byte, Char]], CC_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, (_,_)), _, _) => 0 
  case CC_A(CC_E(CC_D(_, _)), _, _) => 1 
  case CC_A(CC_E(CC_E(_)), _, _) => 2 
  case CC_C(_, CC_B((_,_), _)) => 3 
}
}
// This is not matched: CC_B(_, _)