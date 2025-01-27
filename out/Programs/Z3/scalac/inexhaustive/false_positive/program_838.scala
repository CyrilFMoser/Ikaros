package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[Byte], T_A[Char, Int]]
case class CC_B() extends T_A[T_B[Byte], T_A[Char, Int]]
case class CC_C(a: CC_B) extends T_B[CC_B]
case class CC_D() extends T_B[CC_B]

val v_a: T_A[T_B[Byte], T_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_A Boolean (T_A (T_B Byte) (T_A Char Int)))
// This is not matched: (CC_F Wildcard T_B)