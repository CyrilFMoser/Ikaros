package Program_31 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B) extends T_A[B]
case class CC_B[C](a: (T_B,T_B), b: T_A[C]) extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_A[CC_C], b: CC_A[CC_C], c: CC_A[CC_C]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, CC_A(_)) => 1 
  case CC_B((CC_B(_, _),CC_B(_, _)), _) => 2 
  case CC_B((CC_D(_, _, _),CC_B(_, _)), _) => 3 
  case CC_B((CC_B(_, _),CC_C()), CC_A(_)) => 4 
  case CC_B((CC_C(),CC_B(_, _)), _) => 5 
  case CC_B((CC_B(_, _),CC_D(_, _, _)), CC_A(_)) => 6 
  case CC_B((CC_C(),CC_D(_, _, _)), _) => 7 
  case CC_B((CC_B(_, _),CC_D(_, _, _)), _) => 8 
  case CC_B((CC_D(_, _, _),CC_D(_, _, _)), _) => 9 
  case CC_B(_, CC_A(_)) => 10 
  case CC_B((CC_C(),CC_B(_, _)), CC_A(_)) => 11 
  case CC_B((CC_D(_, _, _),CC_B(_, _)), CC_A(_)) => 12 
  case CC_B(_, _) => 13 
  case CC_B((CC_D(_, _, _),CC_C()), _) => 14 
  case CC_B((CC_B(_, _),CC_C()), _) => 15 
  case CC_B((CC_C(),CC_D(_, _, _)), CC_A(_)) => 16 
  case CC_B((CC_B(_, _),CC_B(_, _)), CC_A(_)) => 17 
}
}
// This is not matched: (CC_B T_B Wildcard Wildcard T_B)
// This is not matched: (CC_B T_B Wildcard Wildcard T_B)