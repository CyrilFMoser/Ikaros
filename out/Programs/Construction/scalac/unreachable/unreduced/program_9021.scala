package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Char,Boolean), Char], b: (T_A[Boolean, Int],(Int,Byte)), c: T_A[(Char,Boolean), Char]) extends T_A[(Char,Boolean), Char]
case class CC_B(a: (CC_A,CC_A), b: CC_A) extends T_A[(Char,Boolean), Char]
case class CC_C(a: CC_B, b: CC_B) extends T_A[(Char,Boolean), Char]

val v_a: T_A[(Char,Boolean), Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, (_,_), CC_A(_, _, _)), _, _) => 0 
  case CC_A(CC_A(_, (_,_), CC_B(_, _)), _, _) => 1 
  case CC_A(CC_A(_, (_,_), CC_C(_, _)), _, _) => 2 
  case CC_A(CC_B(_, _), _, _) => 3 
  case CC_A(CC_C(CC_B(_, _), _), _, _) => 4 
  case CC_B(_, CC_A(_, _, _)) => 5 
  case CC_C(CC_B(_, CC_A(_, _, _)), _) => 6 
}
}