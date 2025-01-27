package Program_15 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C[B, C](a: T_B[B], b: CC_A, c: T_A) extends T_B[B]
case class CC_D[D](a: T_B[D], b: D, c: D) extends T_B[D]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_C(CC_D(_, _, _), _, CC_A(_, _)) => 1 
  case CC_C(CC_D(_, _, _), CC_A(_, _), _) => 2 
  case CC_C(CC_C(_, _, _), _, CC_B()) => 3 
  case CC_C(CC_C(_, _, _), CC_A(_, _), CC_B()) => 4 
  case CC_C(_, CC_A(_, _), CC_B()) => 5 
  case CC_C(_, _, CC_B()) => 6 
  case CC_C(CC_D(_, _, _), _, CC_B()) => 7 
  case CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)) => 8 
  case CC_C(CC_C(_, _, _), _, CC_A(_, _)) => 9 
  case CC_C(CC_D(_, _, _), _, _) => 10 
  case CC_C(CC_D(_, _, _), CC_A(_, _), CC_B()) => 11 
  case CC_D(CC_C(_, _, _), _, _) => 12 
  case CC_D(CC_C(_, _, _), 0, _) => 13 
  case CC_D(CC_D(_, _, _), _, _) => 14 
  case CC_D(CC_D(_, _, _), _, 0) => 15 
  case CC_D(CC_C(_, _, _), 0, 0) => 16 
  case CC_D(_, _, _) => 17 
  case CC_D(CC_C(_, _, _), _, 0) => 18 
  case CC_D(_, _, 0) => 19 
}
}
// This is not matched: (CC_C Byte
//      (T_B T_A)
//      (CC_C Byte
//            (Generic "C")
//            (CC_C Byte T_A Wildcard Wildcard Wildcard (T_B Byte))
//            (CC_A Wildcard Wildcard T_A)
//            (CC_B T_A)
//            (T_B Byte))
//      Wildcard
//      Wildcard
//      (T_B Byte))
// This is not matched: Pattern match is empty without constants