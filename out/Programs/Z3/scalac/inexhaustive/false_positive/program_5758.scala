package Program_13 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: Boolean, c: T_B[D]) extends T_A[D, T_A[Int, Int]]
case class CC_B[E, F](a: T_B[E], b: T_A[(Char,Char), Int], c: (Boolean,Boolean)) extends T_A[E, T_A[Int, Int]]

val v_a: T_A[Byte, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: (CC_B Byte
//      Boolean
//      Wildcard
//      Wildcard
//      (Tuple Wildcard Boolean)
//      (T_A Byte (T_A Int Int)))
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_A Boolean))