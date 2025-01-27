package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B[E](a: E) extends T_A[E]
case class CC_C(a: Byte, b: Boolean) extends T_A[Byte]
case class CC_D[F, G]() extends T_B[F, G]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, true) => 2 
  case CC_C(_, false) => 3 
}
}