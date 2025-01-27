package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[(Boolean,Byte), Int], (Int,(Char,Byte))]]
case class CC_B[D, E](a: D, b: T_A[E], c: E) extends T_B[D, E]
case class CC_C[G, F, H](a: CC_A) extends T_B[G, F]
case class CC_D[J, I](a: CC_A, b: T_B[CC_C[CC_A, J, J], J]) extends T_B[I, J]

val v_a: T_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_A()) => 1 
}
}
// This is not matched: CC_D(CC_A(), _)