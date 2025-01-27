package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: (T_A,T_A), b: T_A) extends T_A
case class CC_C(a: T_B[T_B[CC_B, CC_A], CC_B], b: CC_A, c: CC_B) extends T_A
case class CC_D[C](a: Int, b: C, c: CC_A) extends T_B[CC_C, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),CC_A()), _) => 1 
  case CC_B((CC_A(),CC_B(_, _)), _) => 2 
  case CC_B((CC_A(),CC_C(_, _, _)), _) => 3 
  case CC_B((CC_B(_, _),CC_A()), _) => 4 
  case CC_B((CC_B(_, _),CC_B(_, _)), _) => 5 
  case CC_B((CC_B(_, _),CC_C(_, _, _)), _) => 6 
  case CC_B((CC_C(_, _, _),CC_B(_, _)), _) => 7 
  case CC_B((CC_C(_, _, _),CC_C(_, _, _)), _) => 8 
  case CC_C(_, _, CC_B((_,_), _)) => 9 
}
}
// This is not matched: CC_B((CC_C(_, _, _),CC_A()), _)