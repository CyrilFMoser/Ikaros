package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Char) extends T_A
case class CC_B(a: (CC_A,T_A), b: CC_A, c: (Int,(CC_A,CC_A))) extends T_A
case class CC_C(a: (CC_A,T_B[CC_B, CC_B]), b: (CC_A,CC_A)) extends T_A
case class CC_D[C](a: CC_A) extends T_B[T_B[C, C], C]
case class CC_E[D](a: T_B[T_B[D, D], D], b: Byte, c: D) extends T_B[T_B[D, D], D]
case class CC_F[E](a: CC_C, b: Byte) extends T_B[T_B[T_B[CC_C, CC_C], CC_C], E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _), _) => 1 
  case CC_A(CC_A(CC_C(_, _), _), _) => 2 
  case CC_A(CC_B((_,_), CC_A(_, _), (_,_)), _) => 3 
  case CC_A(CC_C(_, _), _) => 4 
  case CC_B((CC_A(_, _),CC_A(_, _)), CC_A(_, _), (_,(_,_))) => 5 
  case CC_B((CC_A(_, _),CC_B(_, _, _)), CC_A(_, _), (_,(_,_))) => 6 
  case CC_C((CC_A(_, _),_), (CC_A(_, _),CC_A(_, _))) => 7 
}
}
// This is not matched: CC_B((CC_A(_, _),CC_C(_, _)), CC_A(_, _), (_,(_,_)))