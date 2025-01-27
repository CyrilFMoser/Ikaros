package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_B[D](a: T_B[D], b: D) extends T_A[D]
case class CC_C() extends T_B[(Boolean,Char)]
case class CC_D() extends T_B[(Boolean,Char)]

val v_a: T_A[T_B[(Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C()) => 0 
}
}
// This is not matched: (CC_B Int Wildcard (T_A Int))