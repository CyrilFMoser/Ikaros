package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B() extends T_B[CC_A[Int], Boolean]
case class CC_C(a: T_B[CC_B, CC_B], b: Char) extends T_B[CC_A[Int], Boolean]

val v_a: T_B[CC_A[Int], Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, 'x') => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A Boolean))