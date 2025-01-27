package Program_63 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Int,Char), b: T_A[Int]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A((12,_), _) => 0 
}
}
// This is not matched: (CC_A (Tuple (CC_A (Tuple Wildcard Wildcard) (Tuple Wildcard Wildcard) T_A)
//             (CC_A Wildcard (Tuple Wildcard Wildcard) T_A))
//      Wildcard
//      T_A)