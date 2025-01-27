package Program_30 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: A) extends T_A
case class CC_B(a: Byte, b: CC_A[T_B], c: Int) extends T_A
case class CC_C(a: Int, b: Byte) extends T_B
case class CC_D(a: T_A, b: Int, c: T_A) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(0, _, 12) => 1 
  case CC_B(_, _, 12) => 2 
  case CC_B(_, _, _) => 3 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_C Int
//      (CC_B Int Wildcard (CC_C Int Wildcard (T_A Int)) Int (T_A Int))
//      (T_A Int))