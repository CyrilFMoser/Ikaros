package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (T_A[Byte, Boolean],Byte), c: T_A[C, C]) extends T_A[Byte, C]
case class CC_B[D]() extends T_A[D, Byte]
case class CC_C[E](a: T_A[Byte, E], b: (Int,(Char,Int)), c: (CC_B[(Int,Int)],T_A[Byte, Boolean])) extends T_A[Byte, E]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _, _),0), _) => 0 
  case CC_A(_, (CC_A(_, _, _),_), _) => 1 
  case CC_A(_, (CC_C(_, _, _),0), _) => 2 
  case CC_A(_, (CC_C(_, _, _),_), _) => 3 
  case CC_B() => 4 
  case CC_C(CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)), _, _) => 5 
  case CC_C(CC_A(CC_A(_, _, _), (_,_), CC_B()), _, _) => 6 
  case CC_C(CC_A(CC_A(_, _, _), (_,_), CC_C(_, _, _)), _, _) => 7 
  case CC_C(CC_A(CC_B(), (_,_), CC_A(_, _, _)), _, _) => 8 
  case CC_C(CC_A(CC_B(), (_,_), CC_B()), _, _) => 9 
  case CC_C(CC_A(CC_B(), (_,_), CC_C(_, _, _)), _, _) => 10 
  case CC_C(CC_A(CC_C(_, _, _), (_,_), CC_A(_, _, _)), _, _) => 11 
  case CC_C(CC_A(CC_C(_, _, _), (_,_), CC_B()), _, _) => 12 
  case CC_C(CC_A(CC_C(_, _, _), (_,_), CC_C(_, _, _)), _, _) => 13 
  case CC_C(CC_B(), _, _) => 14 
  case CC_C(CC_C(CC_A(_, _, _), (_,_), _), _, _) => 15 
  case CC_C(CC_C(CC_B(), (_,_), _), _, _) => 16 
  case CC_C(CC_C(CC_C(_, _, _), (_,_), _), _, _) => 17 
}
}