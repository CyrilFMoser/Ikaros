package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_B[Byte], D], b: (T_B[Int],(Byte,(Byte,Char))), c: Char) extends T_A[T_B[Byte], D]
case class CC_B[E](a: Byte, b: T_B[E], c: T_A[E, E]) extends T_A[T_B[Byte], E]
case class CC_C[F]() extends T_A[F, CC_B[F]]
case class CC_D(a: CC_A[CC_C[Int]], b: T_A[T_B[Byte], CC_A[(Byte,Byte)]], c: (T_B[Char],(Boolean,Byte))) extends T_B[CC_B[CC_B[(Char,Char)]]]
case class CC_E[G](a: G, b: T_A[G, CC_B[G]]) extends T_B[G]
case class CC_F[H]() extends T_B[H]

val v_a: T_A[T_B[Byte], Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), (_,_), 'x'), (CC_E(_, _),(_,_)), _) => 0 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), _), (CC_E(_, _),(_,_)), _) => 1 
  case CC_A(CC_A(CC_B(_, _, _), (_,_), 'x'), (CC_E(_, _),(_,_)), _) => 2 
  case CC_A(CC_A(CC_B(_, _, _), (_,_), _), (CC_E(_, _),(_,_)), _) => 3 
  case CC_A(CC_B(_, CC_E(_, _), _), (CC_E(_, _),(_,_)), _) => 4 
  case CC_A(CC_B(_, CC_F(), _), (CC_E(_, _),(_,_)), _) => 5 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), 'x'), (CC_F(),(_,_)), _) => 6 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), _), (CC_F(),(_,_)), _) => 7 
  case CC_A(CC_A(CC_B(_, _, _), (_,_), 'x'), (CC_F(),(_,_)), _) => 8 
  case CC_A(CC_A(CC_B(_, _, _), (_,_), _), (CC_F(),(_,_)), _) => 9 
  case CC_A(CC_B(_, CC_E(_, _), _), (CC_F(),(_,_)), _) => 10 
  case CC_A(CC_B(_, CC_F(), _), (CC_F(),(_,_)), _) => 11 
  case CC_B(0, CC_E(_, _), _) => 12 
  case CC_B(0, CC_F(), _) => 13 
  case CC_B(_, CC_E(_, _), _) => 14 
  case CC_B(_, CC_F(), _) => 15 
}
}