package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: E, b: D) extends T_A[D, E]
case class CC_B[G, F](a: CC_A[CC_A[G, F], F], b: G) extends T_A[G, F]
case class CC_C[H, I](a: T_A[I, H]) extends T_A[I, H]
case class CC_D(a: T_B[T_B[Boolean]], b: T_A[(Char,(Boolean,Char)), (Char,Byte)], c: T_B[T_A[Int, Byte]]) extends T_B[CC_A[(Byte,Byte), T_A[Char, Char]]]
case class CC_E(a: CC_C[T_A[CC_D, (Byte,Byte)], CC_A[CC_D, CC_D]]) extends T_B[CC_A[(Byte,Byte), T_A[Char, Char]]]
case class CC_F(a: CC_D, b: (((Char,Int),CC_E),CC_B[CC_E, CC_E]), c: CC_B[T_A[CC_D, Boolean], T_A[CC_D, CC_E]]) extends T_B[CC_A[(Byte,Byte), T_A[Char, Char]]]

val v_a: T_B[CC_A[(Byte,Byte), T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A((_,_), (_,_)), _) => 0 
  case CC_D(_, CC_B(_, _), _) => 1 
  case CC_D(_, CC_C(CC_B(_, _)), _) => 2 
  case CC_D(_, CC_C(CC_C(_)), _) => 3 
  case CC_E(_) => 4 
  case CC_F(_, _, _) => 5 
}
}
// This is not matched: CC_D(_, CC_C(CC_A(_, _)), _)