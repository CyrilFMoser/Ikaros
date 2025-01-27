package Program_30 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Boolean,Int)], b: T_A[Char], c: T_B[Int]) extends T_A[T_A[Int]]
case class CC_B() extends T_A[T_A[Int]]
case class CC_C[C](a: Byte) extends T_A[T_A[Int]]
case class CC_D[D](a: T_B[D]) extends T_B[CC_C[CC_A]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(0) => 1 
  case CC_C(_) => 2 
  case CC_A(_, _, _) => 3 
}
}
// This is not matched: (CC_C Boolean Byte (T_A (T_A Int)))
// This is not matched: (CC_C Wildcard (CC_A Boolean T_A) Wildcard T_A)