package Program_31 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (Byte,Int)) extends T_A[T_B[Int, Int]]
case class CC_B(a: Char) extends T_A[T_B[Int, Int]]
case class CC_C[E](a: CC_A[E], b: CC_B) extends T_B[E, Int]
case class CC_D(a: CC_C[Char], b: (Boolean,CC_B), c: Char) extends T_B[CC_A[CC_B], Int]

val v_a: T_A[T_B[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A((_,_)) => 1 
  case CC_A((0,_)) => 2 
  case CC_A(_) => 3 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_B Int Int)))
// This is not matched: (CC_B Wildcard T_A)