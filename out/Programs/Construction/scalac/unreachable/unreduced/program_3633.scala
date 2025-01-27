package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: CC_A, b: CC_A) extends T_A
case class CC_C(a: ((CC_A,T_A),CC_A), b: T_B[CC_B, (CC_A,CC_B)], c: T_B[T_B[CC_A, (Byte,Char)], CC_B]) extends T_A
case class CC_D[C](a: T_B[C, Char], b: CC_B) extends T_B[C, Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(CC_A(_), CC_A(_))) => 1 
  case CC_A(CC_C(_, _, _)) => 2 
  case CC_B(_, _) => 3 
  case CC_C(((_,_),CC_A(_)), _, _) => 4 
}
}