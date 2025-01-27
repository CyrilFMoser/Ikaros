package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[E](a: Int) extends T_A[T_A[Byte, Boolean], E]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B (CC_A Byte Char Wildcard (T_A Byte)) T_B)