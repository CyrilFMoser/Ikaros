package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[Char, C], c: Byte) extends T_A[Char, C]
case class CC_B[D](a: T_A[D, D], b: (Char,Char), c: D) extends T_A[Char, D]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), 0) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _), _), 0) => 1 
  case CC_A(_, CC_B(_, (_,_), _), 0) => 2 
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 3 
  case CC_A(_, CC_A(_, CC_B(_, _, _), _), _) => 4 
  case CC_A(_, CC_B(_, (_,_), _), _) => 5 
  case CC_B(_, (_,'x'), _) => 6 
  case CC_B(_, (_,_), _) => 7 
}
}