package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int) extends T_A[T_A[Int]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B Byte (T_A T_B Byte))