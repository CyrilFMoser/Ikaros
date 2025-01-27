package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: ((Char,T_B),Int), b: T_A[Boolean, C], c: Char) extends T_A[Boolean, C]
case class CC_B[D]() extends T_A[Boolean, D]
case class CC_C[E](a: T_A[Boolean, E], b: E, c: (T_A[T_B, T_B],Byte)) extends T_A[Boolean, E]
case class CC_D() extends T_B
case class CC_E(a: CC_D, b: T_A[Boolean, T_A[Boolean, T_B]], c: T_B) extends T_B

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), 'x') => 0 
  case CC_A(_, CC_B(), 'x') => 1 
  case CC_A(_, CC_C(CC_A(_, _, _), _, (_,_)), 'x') => 2 
  case CC_A(_, CC_C(CC_B(), _, (_,_)), 'x') => 3 
  case CC_A(_, CC_C(CC_C(_, _, _), _, (_,_)), 'x') => 4 
  case CC_A(_, CC_B(), _) => 5 
  case CC_A(_, CC_C(CC_A(_, _, _), _, (_,_)), _) => 6 
  case CC_A(_, CC_C(CC_B(), _, (_,_)), _) => 7 
  case CC_A(_, CC_C(CC_C(_, _, _), _, (_,_)), _) => 8 
  case CC_B() => 9 
  case CC_C(_, _, _) => 10 
}
}
// This is not matched: CC_A(_, CC_A(_, _, _), _)