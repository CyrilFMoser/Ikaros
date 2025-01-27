package Program_15 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B() extends T_B[Int]
case class CC_C(a: Boolean, b: T_A[CC_B]) extends T_B[Int]
case class CC_D[D](a: CC_B, b: D, c: T_A[D]) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_D(CC_B(), _, CC_A()) => 1 
  case CC_D(CC_B(), _, _) => 2 
  case CC_D(_, _, _) => 3 
  case CC_D(_, _, CC_A()) => 4 
  case CC_C(_, _) => 5 
}
}
// This is not matched: (CC_D Boolean Wildcard Wildcard Wildcard (T_B Int))
// This is not matched: (CC_A Char (CC_F Wildcard T_B) (T_A Boolean Char))