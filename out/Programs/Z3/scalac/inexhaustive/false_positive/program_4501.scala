package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: Char) extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C() extends T_A[Int]

val v_a: CC_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_B Char (T_A Char))