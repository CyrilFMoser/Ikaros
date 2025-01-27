package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[C, D], b: T_A[C, C], c: D) extends T_A[D, C]
case class CC_B[E, F](a: (T_A[Char, Char],T_A[Byte, Boolean]), b: Char) extends T_A[E, F]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), 0), CC_A(_, _, 0), _) => 0 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), 0), CC_A(_, _, _), _) => 1 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), 0), CC_B((_,_), _), _) => 2 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(_, _, 0), _) => 3 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(_, _, _), _) => 4 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_B((_,_), _), _) => 5 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _), 0), CC_A(_, _, 0), _) => 6 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _), 0), CC_A(_, _, _), _) => 7 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _), 0), CC_B((_,_), _), _) => 8 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _), _), CC_A(_, _, 0), _) => 9 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _), _), CC_A(_, _, _), _) => 10 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _), _), CC_B((_,_), _), _) => 11 
  case CC_A(CC_A(CC_B(_, _), CC_A(_, _, _), 0), CC_A(_, _, 0), _) => 12 
  case CC_A(CC_A(CC_B(_, _), CC_A(_, _, _), 0), CC_A(_, _, _), _) => 13 
  case CC_A(CC_A(CC_B(_, _), CC_A(_, _, _), 0), CC_B((_,_), _), _) => 14 
  case CC_A(CC_A(CC_B(_, _), CC_A(_, _, _), _), CC_A(_, _, 0), _) => 15 
  case CC_A(CC_A(CC_B(_, _), CC_A(_, _, _), _), CC_A(_, _, _), _) => 16 
  case CC_A(CC_A(CC_B(_, _), CC_A(_, _, _), _), CC_B((_,_), _), _) => 17 
  case CC_A(CC_A(CC_B(_, _), CC_B(_, _), 0), CC_A(_, _, 0), _) => 18 
  case CC_A(CC_A(CC_B(_, _), CC_B(_, _), 0), CC_A(_, _, _), _) => 19 
  case CC_A(CC_A(CC_B(_, _), CC_B(_, _), 0), CC_B((_,_), _), _) => 20 
  case CC_A(CC_A(CC_B(_, _), CC_B(_, _), _), CC_A(_, _, 0), _) => 21 
  case CC_A(CC_A(CC_B(_, _), CC_B(_, _), _), CC_A(_, _, _), _) => 22 
  case CC_A(CC_A(CC_B(_, _), CC_B(_, _), _), CC_B((_,_), _), _) => 23 
  case CC_A(CC_B((_,_), 'x'), CC_A(_, _, 0), _) => 24 
  case CC_A(CC_B((_,_), 'x'), CC_A(_, _, _), _) => 25 
  case CC_A(CC_B((_,_), 'x'), CC_B((_,_), _), _) => 26 
  case CC_A(CC_B((_,_), _), CC_A(_, _, 0), _) => 27 
  case CC_A(CC_B((_,_), _), CC_A(_, _, _), _) => 28 
  case CC_A(CC_B((_,_), _), CC_B((_,_), _), _) => 29 
  case CC_B((CC_A(_, _, _),CC_A(_, _, _)), _) => 30 
  case CC_B((CC_A(_, _, _),CC_B(_, _)), _) => 31 
  case CC_B((CC_B(_, _),CC_A(_, _, _)), _) => 32 
  case CC_B((CC_B(_, _),CC_B(_, _)), _) => 33 
}
}