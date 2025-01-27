package Program_14 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Int, T_A[Byte, Byte]]
case class CC_B[D, C, E](a: (CC_A,Char)) extends T_A[D, C]
case class CC_C(a: T_A[CC_A, CC_A], b: CC_A, c: T_A[(Int,Char), CC_A]) extends T_A[Int, T_A[Byte, Byte]]

val v_a: T_A[Int, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),_)) => 1 
  case CC_B(_) => 2 
  case CC_C(CC_B(_), CC_A(), _) => 3 
  case CC_C(_, CC_A(), CC_B(_)) => 4 
  case CC_C(CC_B(_), _, _) => 5 
  case CC_C(CC_B(_), CC_A(), CC_B(_)) => 6 
  case CC_C(CC_B(_), _, CC_B(_)) => 7 
}
}
// This is not matched: (CC_B Int
//      (T_A Byte Byte)
//      (CC_C Boolean
//            (T_A Boolean (T_A (T_A Boolean Boolean) Boolean))
//            Boolean
//            Boolean)
//      Wildcard
//      (T_A Int (T_A Byte Byte)))
// This is not matched: (CC_B Wildcard Wildcard T_A)