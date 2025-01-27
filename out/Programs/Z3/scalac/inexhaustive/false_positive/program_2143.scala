package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]
case class CC_B[D](a: T_A[D], b: D) extends T_A[D]
case class CC_C() extends T_A[T_A[Byte]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_B(_, _), 12) => 1 
  case CC_B(_, _) => 2 
  case CC_B(CC_A(), 12) => 3 
  case CC_B(_, 12) => 4 
}
}
// This is not matched: (CC_A Int (CC_A (T_A Boolean) Boolean Boolean) (T_A Int))
// This is not matched: (CC_B Char Wildcard Char (T_A Char Char))