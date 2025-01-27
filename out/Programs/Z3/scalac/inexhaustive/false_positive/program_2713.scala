package Program_31 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_A[T_B, D], b: T_A[T_B, D], c: C) extends T_A[T_B, C]

val v_a: CC_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Int
//      Wildcard
//      (CC_A Int T_B Wildcard Wildcard Wildcard (T_A T_B Int))
//      Wildcard
//      (T_A T_B Boolean))
// This is not matched: Pattern match is empty without constants