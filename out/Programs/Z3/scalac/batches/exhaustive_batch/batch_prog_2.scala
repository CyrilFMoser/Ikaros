package Program_2 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: (CC_A,T_A), b: CC_A, c: T_A) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _), CC_A(_, _)) => 0 
  case CC_B((CC_A(_, _),CC_A(_, _)), _, CC_B(_, _, _)) => 1 
  case CC_B((CC_A(_, _),CC_B(_, _, _)), _, _) => 2 
  case CC_B((CC_A(_, _),CC_B(_, _, _)), CC_A(_, _), CC_B(_, _, _)) => 3 
  case CC_B(_, _, _) => 4 
  case CC_B(_, CC_A(_, _), _) => 5 
  case CC_B((CC_A(_, _),CC_A(_, _)), CC_A(_, _), CC_B(_, _, _)) => 6 
  case CC_B((CC_A(_, _),CC_B(_, _, _)), _, CC_B(_, _, _)) => 7 
  case CC_B((CC_A(_, _),CC_A(_, _)), CC_A(_, _), CC_A(_, _)) => 8 
  case CC_B(_, CC_A(_, _), CC_B(_, _, _)) => 9 
  case CC_B((CC_A(_, _),CC_B(_, _, _)), CC_A(_, _), _) => 10 
}
}