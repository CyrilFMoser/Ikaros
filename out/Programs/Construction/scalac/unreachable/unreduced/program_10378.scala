package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Int, C], b: (T_A[Byte, Byte],T_A[Int, (Byte,Byte)]), c: Char) extends T_A[C, T_A[C, C]]
case class CC_B(a: CC_A[T_A[Boolean, Boolean]], b: (CC_A[Int],(Boolean,Boolean)), c: T_A[Int, T_A[Int, Int]]) extends T_A[CC_A[CC_A[Boolean]], T_A[CC_A[CC_A[Boolean]], CC_A[CC_A[Boolean]]]]
case class CC_C[D](a: CC_B, b: T_A[D, T_A[D, D]], c: D) extends T_A[D, T_A[D, D]]

val v_a: T_A[CC_A[CC_A[Boolean]], T_A[CC_A[CC_A[Boolean]], CC_A[CC_A[Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, (_,_), 'x'), (CC_A(_, _, _),(_,_)), CC_A(_, _, _)) => 1 
  case CC_B(CC_A(_, (_,_), _), (CC_A(_, _, _),(_,_)), CC_A(_, _, _)) => 2 
  case CC_B(CC_A(_, (_,_), 'x'), (CC_A(_, _, _),(_,_)), CC_C(_, CC_A(_, _, _), _)) => 3 
  case CC_B(CC_A(_, (_,_), _), (CC_A(_, _, _),(_,_)), CC_C(_, CC_A(_, _, _), _)) => 4 
  case CC_B(CC_A(_, (_,_), 'x'), (CC_A(_, _, _),(_,_)), CC_C(_, CC_C(_, _, _), _)) => 5 
  case CC_B(CC_A(_, (_,_), _), (CC_A(_, _, _),(_,_)), CC_C(_, CC_C(_, _, _), _)) => 6 
  case CC_C(_, _, _) => 7 
}
}