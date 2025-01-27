package Program_15 

package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[Int]]
case class CC_B(a: T_A[Char], b: T_A[(Char,Byte)], c: CC_A[(Boolean,Int)]) extends T_A[T_A[Int]]
case class CC_C[C](a: (CC_B,CC_B), b: CC_B, c: Int) extends T_A[C]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_C(_, _, _), CC_C(_, _, _), _) => 1 
  case CC_B(CC_C(_, _, _), _, CC_A()) => 2 
  case CC_B(CC_C(_, _, _), _, _) => 3 
  case CC_B(_, _, _) => 4 
  case CC_C((CC_B(_, _, _),CC_B(_, _, _)), _, _) => 5 
  case CC_C(_, CC_B(_, _, _), 12) => 6 
  case CC_C((CC_B(_, _, _),CC_B(_, _, _)), CC_B(_, _, _), _) => 7 
}
}
// This is not matched: (CC_A Boolean (T_A (T_A Int)))
// This is not matched: (CC_B Wildcard Wildcard T_A)