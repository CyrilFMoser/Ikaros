package Program_31 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Int) extends T_A
case class CC_B(a: (CC_A,Int), b: T_B[T_A, T_A], c: T_A) extends T_A
case class CC_C[C](a: Boolean, b: C, c: CC_B) extends T_A
case class CC_D[E, D](a: CC_A, b: T_B[E, E]) extends T_B[E, D]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_D(_, _), CC_C(_, _, _)) => 0 
  case CC_B((CC_A(_, _),12), CC_D(_, _), CC_A(_, _)) => 1 
  case CC_B((CC_A(_, _),_), CC_D(_, _), CC_C(_, _, _)) => 2 
  case CC_B(_, CC_D(_, _), CC_A(_, _)) => 3 
  case CC_B((CC_A(_, _),_), _, CC_B(_, _, _)) => 4 
  case CC_B((CC_A(_, _),12), CC_D(_, _), CC_B(_, _, _)) => 5 
  case CC_B(_, _, CC_B(_, _, _)) => 6 
  case CC_B((CC_A(_, _),12), _, CC_A(_, _)) => 7 
}
}
// This is not matched: (CC_B Wildcard
//      Wildcard
//      (CC_C Boolean
//            Wildcard
//            Boolean
//            (CC_B Wildcard
//                  (CC_D T_A
//                        T_A
//                        Wildcard
//                        (CC_D T_A T_A Wildcard Wildcard (T_B T_A T_A))
//                        (T_B T_A T_A))
//                  Wildcard
//                  T_A)
//            T_A)
//      T_A)
// This is not matched: Pattern match is empty without constants