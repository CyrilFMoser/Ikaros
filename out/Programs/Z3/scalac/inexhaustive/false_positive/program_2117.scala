package Program_31 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_B[D, E], b: Char) extends T_A[D]
case class CC_B[F](a: T_A[Boolean], b: CC_A[F, F], c: (Char,Int)) extends T_A[F]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(_, 'x') => 1 
  case CC_B(_, CC_A(_, _), (_,12)) => 2 
  case CC_B(_, CC_A(_, _), ('x',12)) => 3 
  case CC_B(CC_A(_, _), _, (_,_)) => 4 
  case CC_B(CC_A(_, _), CC_A(_, _), _) => 5 
  case CC_B(CC_B(_, _, _), CC_A(_, _), (_,12)) => 6 
  case CC_B(CC_B(_, _, _), _, ('x',_)) => 7 
  case CC_B(CC_A(_, _), _, _) => 8 
  case CC_B(CC_B(_, _, _), CC_A(_, _), ('x',12)) => 9 
  case CC_B(_, _, _) => 10 
  case CC_B(CC_A(_, _), _, (_,12)) => 11 
  case CC_B(CC_B(_, _, _), CC_A(_, _), (_,_)) => 12 
  case CC_B(CC_B(_, _, _), _, _) => 13 
  case CC_B(CC_B(_, _, _), CC_A(_, _), _) => 14 
  case CC_B(CC_A(_, _), CC_A(_, _), (_,12)) => 15 
  case CC_B(CC_A(_, _), _, ('x',12)) => 16 
  case CC_B(CC_B(_, _, _), _, ('x',12)) => 17 
  case CC_B(CC_B(_, _, _), _, (_,12)) => 18 
  case CC_B(_, _, ('x',_)) => 19 
  case CC_B(CC_B(_, _, _), _, (_,_)) => 20 
  case CC_B(CC_A(_, _), CC_A(_, _), ('x',_)) => 21 
  case CC_B(CC_A(_, _), CC_A(_, _), (_,_)) => 22 
  case CC_B(_, _, (_,_)) => 23 
}
}
// This is not matched: (CC_A Int Boolean Wildcard Wildcard (T_A Int))
// This is not matched: (CC_B Byte Char Wildcard Wildcard (T_A Char Byte))