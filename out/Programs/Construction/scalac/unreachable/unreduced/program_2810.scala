package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[T_B[T_A[(Char,Char)], ((Byte,Char),Byte)]]
case class CC_B(a: CC_A[T_A[Byte]], b: T_A[T_B[Int, Char]]) extends T_A[T_B[T_A[(Char,Char)], ((Byte,Char),Byte)]]
case class CC_C[F, E](a: (T_B[CC_B, (Byte,Byte)],CC_A[(Byte,Boolean)])) extends T_B[F, E]
case class CC_D[G](a: T_B[Byte, G], b: (CC_C[CC_B, CC_B],T_A[CC_B]), c: Boolean) extends T_B[Byte, G]
case class CC_E[H](a: T_B[Byte, H], b: CC_A[CC_D[H]], c: T_B[Byte, T_B[CC_A[Boolean], CC_A[Boolean]]]) extends T_B[Byte, H]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_C((CC_C(_),CC_A(_))) => 0 
  case CC_D(_, (CC_C(_),_), _) => 1 
  case CC_E(_, CC_A(_), CC_C((_,_))) => 2 
  case CC_E(_, CC_A(_), CC_D(CC_C(_), (_,_), _)) => 3 
  case CC_E(_, CC_A(_), CC_D(CC_D(_, _, _), (_,_), _)) => 4 
  case CC_E(_, CC_A(_), CC_D(CC_E(_, _, _), (_,_), _)) => 5 
  case CC_E(_, CC_A(_), CC_E(_, CC_A(_), CC_C(_))) => 6 
  case CC_E(_, CC_A(_), CC_E(_, CC_A(_), CC_D(_, _, _))) => 7 
  case CC_E(_, CC_A(_), CC_E(_, CC_A(_), CC_E(_, _, _))) => 8 
}
}