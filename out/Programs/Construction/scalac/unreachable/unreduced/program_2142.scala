package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Char, T_B[T_A, Char]]) extends T_A
case class CC_B(a: (T_A,T_B[CC_A, T_A]), b: T_A) extends T_A
case class CC_C[C](a: CC_B) extends T_A
case class CC_D[D](a: D, b: CC_B) extends T_B[D, T_B[Boolean, CC_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((CC_A(_),_), CC_A(_)) => 1 
  case CC_B((CC_B(_, _),_), CC_A(_)) => 2 
  case CC_B((CC_C(_),_), CC_A(_)) => 3 
  case CC_B((CC_A(_),_), CC_B((_,_), CC_A(_))) => 4 
  case CC_B((CC_B(_, _),_), CC_B((_,_), CC_A(_))) => 5 
  case CC_B((CC_C(_),_), CC_B((_,_), CC_A(_))) => 6 
  case CC_B((CC_A(_),_), CC_B((_,_), CC_B(_, _))) => 7 
  case CC_B((CC_B(_, _),_), CC_B((_,_), CC_B(_, _))) => 8 
  case CC_B((CC_C(_),_), CC_B((_,_), CC_B(_, _))) => 9 
  case CC_B((CC_A(_),_), CC_B((_,_), CC_C(_))) => 10 
  case CC_B((CC_B(_, _),_), CC_B((_,_), CC_C(_))) => 11 
  case CC_B((CC_C(_),_), CC_B((_,_), CC_C(_))) => 12 
  case CC_B((CC_A(_),_), CC_C(_)) => 13 
  case CC_B((CC_B(_, _),_), CC_C(_)) => 14 
  case CC_C(_) => 15 
}
}
// This is not matched: CC_B((CC_C(_),_), CC_C(_))