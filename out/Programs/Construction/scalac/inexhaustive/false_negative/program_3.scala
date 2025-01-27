package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Boolean, T_A[Char, Char]], b: T_A[Boolean, C], c: T_A[Boolean, C]) extends T_A[Boolean, C]
case class CC_B(a: (CC_A[Char],Boolean), b: T_A[Boolean, T_A[Int, Int]], c: T_A[Char, T_A[Byte, (Byte,Boolean)]]) extends T_A[Boolean, T_A[CC_A[(Int,Boolean)], Byte]]
case class CC_C[E](a: E) extends T_A[Boolean, E]

val v_a: T_A[Boolean, T_A[CC_A[(Int,Boolean)], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, CC_A(_, _, _), _)) => 1 
  case CC_A(_, _, CC_A(_, _, CC_B(_, _, _))) => 2 
  case CC_A(CC_A(_, _, _), _, CC_A(_, CC_B(_, _, _), _)) => 3 
  case CC_A(_, _, CC_A(_, CC_C(_), _)) => 4 
  case CC_A(_, _, CC_A(CC_C(_), CC_A(_, _, _), _)) => 5 
  case CC_A(_, _, CC_C(_)) => 6 
  case CC_A(CC_C(_), _, _) => 7 
  case CC_A(CC_C(_), _, _) => 8 
  case CC_A(CC_C(_), _, _) => 9 
  case CC_A(CC_C(_), _, CC_A(_, CC_C(_), CC_B(_, _, _))) => 10 
  case CC_A(CC_C(_), _, CC_A(_, _, _)) => 11 
  case CC_A(_, _, CC_A(CC_C(_), _, _)) => 12 
  case CC_A(_, _, CC_A(_, _, CC_C(_))) => 13 
  case CC_A(_, _, CC_A(_, CC_C(_), CC_C(_))) => 14 
  case CC_A(_, _, CC_B(_, _, _)) => 15 
  case CC_B((_,_), _, _) => 16 
  case CC_C(_) => 17 
}
}