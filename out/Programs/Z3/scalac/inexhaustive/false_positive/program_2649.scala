package Program_30 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (Byte,(Boolean,Boolean)), b: T_B[T_A]) extends T_A
case class CC_B(a: (T_A,CC_A), b: T_B[CC_A], c: T_A) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[B, C](a: Boolean, b: T_B[B], c: CC_B) extends T_B[B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_)), _) => 0 
  case CC_A((0,(_,_)), CC_D(_, _, _)) => 1 
  case CC_C(_) => 2 
  case CC_B(_, _, CC_A(_, _)) => 3 
  case CC_B((CC_C(_),CC_A(_, _)), _, CC_B(_, _, _)) => 4 
  case CC_B(_, CC_D(_, _, _), _) => 5 
  case CC_B((CC_A(_, _),CC_A(_, _)), _, _) => 6 
  case CC_B((CC_A(_, _),CC_A(_, _)), _, CC_C(_)) => 7 
  case CC_B(_, CC_D(_, _, _), CC_A(_, _)) => 8 
  case CC_B(_, _, CC_C(_)) => 9 
  case CC_B((CC_C(_),CC_A(_, _)), _, CC_A(_, _)) => 10 
  case CC_B((CC_C(_),CC_A(_, _)), CC_D(_, _, _), CC_B(_, _, _)) => 11 
  case CC_B((CC_B(_, _, _),CC_A(_, _)), CC_D(_, _, _), CC_C(_)) => 12 
  case CC_B((CC_A(_, _),CC_A(_, _)), CC_D(_, _, _), CC_A(_, _)) => 13 
  case CC_B((CC_C(_),CC_A(_, _)), CC_D(_, _, _), CC_C(_)) => 14 
  case CC_B((CC_C(_),CC_A(_, _)), _, CC_C(_)) => 15 
  case CC_B((CC_A(_, _),CC_A(_, _)), CC_D(_, _, _), _) => 16 
  case CC_B((CC_A(_, _),CC_A(_, _)), _, CC_B(_, _, _)) => 17 
  case CC_B((CC_A(_, _),CC_A(_, _)), CC_D(_, _, _), CC_C(_)) => 18 
}
}
// This is not matched: (CC_B (Tuple (CC_B Wildcard Wildcard Wildcard T_A) Wildcard)
//      (CC_D (CC_A T_A T_A T_A)
//            T_A
//            Wildcard
//            Wildcard
//            Wildcard
//            (T_B (CC_A T_A T_A T_A)))
//      (CC_B Wildcard Wildcard Wildcard T_A)
//      T_A)
// This is not matched: (CC_A Char Char Int Wildcard (T_A Char))