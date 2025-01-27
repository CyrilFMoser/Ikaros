package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[Byte, Char]]
case class CC_B() extends T_A[CC_A[Char], T_A[Byte, Char]]
case class CC_C[D](a: D) extends T_A[Int, D]

val v_a: CC_C[T_A[CC_A[Char], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: Pattern match is empty without constants