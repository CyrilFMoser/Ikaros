package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]
case class CC_B[D](a: CC_A[D, (Int,Int)], b: T_A[Byte]) extends T_A[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
}
}
// This is not matched: (CC_A Char Boolean (T_A Char))
// This is not matched: (CC_A Char Boolean (T_A Char))