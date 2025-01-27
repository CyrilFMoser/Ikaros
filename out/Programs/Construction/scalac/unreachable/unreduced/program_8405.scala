package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: ((Char,Int),T_A[Byte, Boolean]), c: T_A[Byte, E]) extends T_A[Byte, E]
case class CC_B[F](a: T_B[F, F], b: (T_A[Byte, Int],T_A[Boolean, Byte])) extends T_A[Byte, F]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(12, ((_,_),CC_A(_, _, _)), CC_A(_, _, _)) => 0 
  case CC_A(_, ((_,_),CC_A(_, _, _)), CC_A(_, _, _)) => 1 
  case CC_A(12, ((_,_),CC_B(_, _)), CC_A(_, _, _)) => 2 
  case CC_A(12, ((_,_),CC_A(_, _, _)), CC_B(_, (_,_))) => 3 
  case CC_A(_, ((_,_),CC_A(_, _, _)), CC_B(_, (_,_))) => 4 
  case CC_A(12, ((_,_),CC_B(_, _)), CC_B(_, (_,_))) => 5 
  case CC_A(_, ((_,_),CC_B(_, _)), CC_B(_, (_,_))) => 6 
  case CC_B(_, _) => 7 
}
}
// This is not matched: CC_A(_, ((_,_),CC_B(_, _)), CC_A(_, _, _))