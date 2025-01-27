package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, D], c: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: Char) extends T_B[CC_A[Boolean], E]
case class CC_C() extends T_B[CC_A[Boolean], Byte]
case class CC_D(a: CC_C, b: T_B[Boolean, T_A[CC_C]], c: T_B[CC_A[Boolean], T_B[CC_C, CC_C]]) extends T_B[CC_A[Boolean], CC_A[CC_B[CC_C]]]

val v_a: T_B[CC_A[Boolean], CC_A[CC_B[CC_C]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_D(CC_C(), _, CC_B(_)) => 1 
}
}