package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_C[I](a: Byte) extends T_A[I, CC_A[I, I]]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants