package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Boolean]
case class CC_B(a: T_B[CC_A, CC_A], b: Byte) extends T_A[Boolean]
case class CC_D[D]() extends T_B[D, Byte]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, 0) => 1 
}
}
// This is not matched: Pattern match is empty without constants