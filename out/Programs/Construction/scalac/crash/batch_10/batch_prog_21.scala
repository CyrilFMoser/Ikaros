package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[(Char,(Char,Int))]
case class CC_B[D, E](a: CC_A, b: E, c: D) extends T_B[D, E]

val v_a: T_B[T_A[(Char,(Char,Int))], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, true, CC_A()) => 0 
  case CC_B(_, false, CC_A()) => 1 
}
}