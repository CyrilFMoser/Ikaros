package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Int, C], b: T_A[C, ((Int,Char),Boolean)], c: (T_A[Int, (Char,Boolean)],(Boolean,Boolean))) extends T_A[Int, C]
case class CC_B[D, E](a: Byte, b: T_A[Int, E], c: (T_A[Int, Char],T_A[Int, Boolean])) extends T_A[Int, D]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), (CC_A(_, _, _),(_,_))) => 0 
  case CC_A(CC_A(_, _, _), CC_B(_, _, (_,_)), (CC_A(_, _, _),(_,_))) => 1 
  case CC_A(CC_B(_, _, _), CC_A(_, _, _), (CC_A(_, _, _),(_,_))) => 2 
  case CC_A(CC_B(_, _, _), CC_B(_, _, (_,_)), (CC_A(_, _, _),(_,_))) => 3 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), (CC_B(_, _, _),(_,_))) => 4 
  case CC_A(CC_A(_, _, _), CC_B(_, _, (_,_)), (CC_B(_, _, _),(_,_))) => 5 
  case CC_A(CC_B(_, _, _), CC_A(_, _, _), (CC_B(_, _, _),(_,_))) => 6 
  case CC_A(CC_B(_, _, _), CC_B(_, _, (_,_)), (CC_B(_, _, _),(_,_))) => 7 
  case CC_B(0, _, (CC_A(_, _, _),CC_A(_, _, _))) => 8 
  case CC_B(0, _, (CC_A(_, _, _),CC_B(_, _, _))) => 9 
  case CC_B(0, _, (CC_B(_, _, _),CC_A(_, _, _))) => 10 
  case CC_B(0, _, (CC_B(_, _, _),CC_B(_, _, _))) => 11 
  case CC_B(_, _, (CC_A(_, _, _),CC_A(_, _, _))) => 12 
  case CC_B(_, _, (CC_A(_, _, _),CC_B(_, _, _))) => 13 
  case CC_B(_, _, (CC_B(_, _, _),CC_A(_, _, _))) => 14 
  case CC_B(_, _, (CC_B(_, _, _),CC_B(_, _, _))) => 15 
}
}