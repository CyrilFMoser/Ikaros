package Program_20 

package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: (Byte,Char), b: T_A[Char, Char], c: T_B[Int]) extends T_A[T_B[Int], Int]
case class CC_B(a: T_B[CC_A]) extends T_A[T_B[Int], Int]
case class CC_C[D](a: T_A[D, D], b: D) extends T_B[T_B[CC_A]]
case class CC_D(a: (CC_B,Byte), b: (Byte,CC_A)) extends T_B[T_B[CC_A]]
case class CC_E(a: Char) extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_E(_) => 1 
  case CC_D((CC_B(_),_), (0,CC_A(_, _, _))) => 3 
  case CC_D((CC_B(_),_), _) => 4 
  case CC_D(_, (0,CC_A(_, _, _))) => 5 
  case CC_D((CC_B(_),_), (_,CC_A(_, _, _))) => 6 
  case CC_D((CC_B(_),0), (_,CC_A(_, _, _))) => 7 
  case CC_D((CC_B(_),0), _) => 8 
}
}
// This is not matched: (CC_C Boolean
//      Wildcard
//      Boolean
//      (T_B (T_B (CC_A Boolean Boolean Boolean Boolean))))
// Mutation information: 
// Deleted Pattern CC_D(_, _) at position 2
// This is not matched: (CC_C Boolean
//      Wildcard
//      Boolean
//      (T_B (T_B (CC_A Boolean Boolean Boolean Boolean))))
// Mutation information: 
// Changing a Wildcard in 0 at pattern position 8 to a constant expression:
// {
//  0
// }
//