package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[(Char,Int)]]
case class CC_B() extends T_A[T_A[(Char,Int)]]
case class CC_C[D, E](a: E, b: E) extends T_B[E, D]

val v_a: CC_C[Int, T_A[T_A[(Char,Int)]]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A()) => 0 
}
}
// This is not matched: CC_B()