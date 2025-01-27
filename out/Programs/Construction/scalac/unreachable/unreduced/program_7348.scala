package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Boolean]
case class CC_B(a: Byte, b: T_B[Char], c: CC_A) extends T_A[Boolean]
case class CC_C[C](a: Char) extends T_B[C]
case class CC_D[D](a: T_A[CC_C[D]], b: T_A[Boolean]) extends T_B[D]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, CC_B(_, _, _)) => 1 
}
}
// This is not matched: CC_D(_, CC_A())