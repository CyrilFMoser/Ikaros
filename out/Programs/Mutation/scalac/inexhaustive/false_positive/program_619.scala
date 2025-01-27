package Program_57 

package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: (Int,Int)) extends T_A[Int]
case class CC_B(a: Char) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (12,_)) => 0 
  case CC_A(_, (_,12)) => 1 
  case CC_A(_, _) => 2 
  case CC_A(_, (_,_)) => 3 
  case CC_B(_) => 4 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A Int))
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 0 to a constant expression:
// {
//  12
// }
//
// This is not matched: Pattern match is empty without constants