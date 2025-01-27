package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: Int, c: D) extends T_A[Boolean, D]
case class CC_B() extends T_B[CC_A[CC_A[Char]]]
case class CC_C(a: T_B[CC_A[CC_B]]) extends T_B[CC_A[CC_A[Char]]]

val v_a: T_B[CC_A[CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
}
}