package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[Int]]
case class CC_B(a: Byte) extends T_A[T_A[Int]]
case class CC_C(a: CC_A[Boolean], b: CC_A[(Byte,Int)]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
  case CC_C(CC_A(), _) => 3 
  case CC_C(_, CC_A()) => 4 
  case CC_C(CC_A(), CC_A()) => 5 
}
}
// This is not matched: (CC_A Boolean (T_A (T_A Int)))
// This is not matched: (CC_A Boolean
//      Wildcard
//      Boolean
//      (CC_A Boolean Boolean Wildcard Wildcard (T_A Boolean))
//      (T_A Boolean))