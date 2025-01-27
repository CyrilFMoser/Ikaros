package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[C, D](a: Int) extends T_A[C, D]
case class CC_C() extends T_A[T_A[Int, Boolean], (Boolean,Int)]

val v_a: CC_B[CC_C, Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_A (CC_B T_B Wildcard (CC_E T_B) (T_A T_B)) (T_A (T_A (Tuple Byte Char))))