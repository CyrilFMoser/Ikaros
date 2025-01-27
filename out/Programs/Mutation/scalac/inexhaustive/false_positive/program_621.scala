package Program_55 

package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: (Int,Int)) extends T_A[Int]
case class CC_B(a: Char) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (12,_)) => 0 
  case CC_A(_, (_,12)) => 1 
  case CC_A(_, (_,_)) => 3 
  case CC_B(_) => 4 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A Int))
// Mutation information: 
// Deleted Pattern CC_A(_, _) at position 2
// This is not matched: Pattern match is empty without constants