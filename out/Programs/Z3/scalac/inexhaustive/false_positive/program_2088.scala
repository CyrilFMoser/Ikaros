package Program_30 

package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[Byte, T_A[T_B, Int]]
case class CC_B(a: T_B, b: T_B) extends T_A[Byte, T_A[T_B, Int]]
case class CC_C(a: T_A[CC_B, T_B], b: CC_B) extends T_A[Byte, T_A[T_B, Int]]
case class CC_D(a: CC_B, b: ((Char,Char),(Byte,Int)), c: CC_A[T_B]) extends T_B

val v_a: T_A[Byte, T_A[T_B, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, CC_B(_, _)) => 1 
  case CC_B(_, _) => 2 
}
}
// This is not matched: (CC_A T_B (T_A Byte (T_A T_B Int)))
// This is not matched: (CC_A T_B (T_A Byte (T_A T_B Int)))