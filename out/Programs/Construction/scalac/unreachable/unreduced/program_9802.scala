package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,T_A[Char, Char]), b: T_A[C, C]) extends T_A[C, Int]
case class CC_B[D](a: T_A[D, Int], b: Boolean) extends T_A[D, Int]
case class CC_C[E](a: (Char,Char), b: T_A[E, Int]) extends T_A[E, Int]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _) => 1 
  case CC_B(CC_B(CC_A(_, _), _), _) => 2 
  case CC_B(CC_B(CC_B(_, _), _), _) => 3 
  case CC_B(CC_B(CC_C(_, _), _), _) => 4 
  case CC_B(CC_C((_,_), CC_A(_, _)), _) => 5 
  case CC_B(CC_C((_,_), CC_B(_, _)), _) => 6 
  case CC_B(CC_C((_,_), CC_C(_, _)), _) => 7 
  case CC_C((_,'x'), _) => 8 
  case CC_C((_,_), _) => 9 
}
}