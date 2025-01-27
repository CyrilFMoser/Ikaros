package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: (T_B[Boolean],T_A[Int])) extends T_A[C]
case class CC_B[D](a: Boolean) extends T_A[D]
case class CC_C[E, F](a: Int, b: T_A[F], c: T_B[F]) extends T_A[E]
case class CC_D(a: Int, b: T_A[Boolean], c: Char) extends T_B[CC_B[CC_C[Boolean, Char]]]
case class CC_E(a: CC_D, b: (T_A[CC_D],(CC_D,CC_D))) extends T_B[CC_B[CC_C[Boolean, Char]]]
case class CC_F(a: Int, b: T_A[T_A[CC_D]], c: Char) extends T_B[CC_B[CC_C[Boolean, Char]]]

val v_a: T_B[CC_B[CC_C[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_, (_,_)), _) => 0 
  case CC_D(_, CC_B(_), _) => 1 
  case CC_D(_, CC_C(_, _, _), _) => 2 
  case CC_E(CC_D(_, CC_A(_, _), 'x'), (CC_A(_, _),(_,_))) => 3 
  case CC_E(CC_D(_, CC_A(_, _), _), (CC_A(_, _),(_,_))) => 4 
  case CC_E(CC_D(_, CC_B(_), 'x'), (CC_A(_, _),(_,_))) => 5 
  case CC_E(CC_D(_, CC_B(_), _), (CC_A(_, _),(_,_))) => 6 
  case CC_E(CC_D(_, CC_C(_, _, _), 'x'), (CC_A(_, _),(_,_))) => 7 
  case CC_E(CC_D(_, CC_C(_, _, _), _), (CC_A(_, _),(_,_))) => 8 
  case CC_E(CC_D(_, CC_A(_, _), 'x'), (CC_B(_),(_,_))) => 9 
  case CC_E(CC_D(_, CC_A(_, _), _), (CC_B(_),(_,_))) => 10 
  case CC_E(CC_D(_, CC_B(_), 'x'), (CC_B(_),(_,_))) => 11 
  case CC_E(CC_D(_, CC_B(_), _), (CC_B(_),(_,_))) => 12 
  case CC_E(CC_D(_, CC_C(_, _, _), 'x'), (CC_B(_),(_,_))) => 13 
  case CC_E(CC_D(_, CC_C(_, _, _), _), (CC_B(_),(_,_))) => 14 
  case CC_E(CC_D(_, CC_A(_, _), 'x'), (CC_C(_, _, _),(_,_))) => 15 
  case CC_E(CC_D(_, CC_A(_, _), _), (CC_C(_, _, _),(_,_))) => 16 
  case CC_E(CC_D(_, CC_B(_), 'x'), (CC_C(_, _, _),(_,_))) => 17 
  case CC_E(CC_D(_, CC_B(_), _), (CC_C(_, _, _),(_,_))) => 18 
  case CC_E(CC_D(_, CC_C(_, _, _), 'x'), (CC_C(_, _, _),(_,_))) => 19 
  case CC_E(CC_D(_, CC_C(_, _, _), _), (CC_C(_, _, _),(_,_))) => 20 
  case CC_F(_, CC_A(_, (_,_)), _) => 21 
  case CC_F(_, CC_B(_), _) => 22 
  case CC_F(_, CC_C(_, _, _), _) => 23 
}
}