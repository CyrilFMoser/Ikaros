package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[E, D], b: Byte) extends T_A[D, C]

val v_a: CC_A[Int, Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), 0) => 0 
  case CC_A(CC_A(_, _), _) => 1 
}
}
// This is not matched: (CC_A Int
//      Byte
//      Int
//      (CC_A Byte Int Boolean Wildcard Wildcard (T_A Int Byte))
//      Wildcard
//      (T_A Byte Int))
// This is not matched: Pattern match is empty without constants