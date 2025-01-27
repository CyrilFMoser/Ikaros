package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_A[Char, Boolean], D]
case class CC_D(a: Byte) extends T_B[CC_A[Int]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants