package Program_31 

package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,Int), b: T_A[C, C]) extends T_A[T_A[Byte, Int], C]
case class CC_B[D](a: CC_A[Boolean], b: CC_A[D], c: T_A[D, D]) extends T_A[CC_A[Int], D]
case class CC_C[E](a: T_A[E, E], b: CC_B[Boolean], c: CC_B[E]) extends T_A[CC_A[Int], (Boolean,Byte)]

val v_a: T_A[CC_A[Int], (Boolean,Byte)] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _, _) => 0 
  case CC_C(_, CC_B(_, _, _), _) => 1 
  case CC_C(CC_B(_, _, _), _, _) => 2 
  case CC_C(_, _, _) => 3 
}
}
// This is not matched: (CC_C (CC_A Boolean
//            Boolean
//            Boolean
//            (T_A Boolean (T_A (T_A Boolean Boolean) Boolean)))
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (CC_A Int Boolean Boolean Boolean) (Tuple Boolean Byte)))
// This is not matched: Pattern match is empty without constants