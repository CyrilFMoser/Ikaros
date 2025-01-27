package Program_31 

package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Byte) extends T_A[D]
case class CC_B[E]() extends T_A[T_B[(Int,Byte), Boolean]]

val v_a: T_A[T_B[(Int,Byte), Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(0) => 1 
  case CC_B() => 2 
}
}
// This is not matched: (CC_B Boolean (T_A (T_B (Tuple Int Byte) Boolean)))
// This is not matched: (CC_B Boolean (T_A (T_B (Tuple Int Byte) Boolean)))