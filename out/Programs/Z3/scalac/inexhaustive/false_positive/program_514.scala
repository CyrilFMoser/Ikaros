package Program_29 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: Int, c: T_A) extends T_A
case class CC_B(a: (CC_A,T_A), b: CC_A, c: T_B[T_A, (Int,Char)]) extends T_A
case class CC_C(a: CC_B, b: CC_A, c: CC_B) extends T_A
case class CC_D[C, D]() extends T_B[C, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), 12, CC_B(_, _, _)) => 0 
  case CC_A(_, 12, _) => 1 
  case CC_A(CC_D(), _, CC_C(_, _, _)) => 2 
  case CC_A(CC_D(), 12, CC_C(_, _, _)) => 3 
  case CC_A(_, 12, CC_C(_, _, _)) => 4 
  case CC_A(CC_D(), 12, _) => 5 
  case CC_A(_, 12, CC_B(_, _, _)) => 6 
  case CC_A(CC_D(), _, CC_B(_, _, _)) => 7 
  case CC_A(_, _, CC_A(_, _, _)) => 8 
  case CC_B((CC_A(_, _, _),CC_C(_, _, _)), CC_A(_, _, _), _) => 9 
  case CC_B((CC_A(_, _, _),CC_B(_, _, _)), _, _) => 10 
  case CC_B((CC_A(_, _, _),CC_A(_, _, _)), CC_A(_, _, _), _) => 11 
  case CC_B(_, CC_A(_, _, _), _) => 12 
  case CC_B((CC_A(_, _, _),CC_B(_, _, _)), CC_A(_, _, _), _) => 13 
  case CC_B((CC_A(_, _, _),CC_A(_, _, _)), _, _) => 14 
  case CC_C(CC_B(_, _, _), _, _) => 15 
  case CC_C(_, CC_A(_, _, _), CC_B(_, _, _)) => 16 
  case CC_C(_, CC_A(_, _, _), _) => 17 
  case CC_C(CC_B(_, _, _), CC_A(_, _, _), _) => 18 
  case CC_C(_, _, CC_B(_, _, _)) => 19 
  case CC_C(_, _, _) => 20 
}
}
// This is not matched: (CC_A (CC_D T_A T_A (T_B T_A T_A))
//      Wildcard
//      (CC_C Wildcard
//            (CC_A (CC_D T_A T_A (T_B T_A T_A)) Int Wildcard T_A)
//            (CC_B Wildcard Wildcard Wildcard T_A)
//            T_A)
//      T_A)
// This is not matched: (CC_B T_A)