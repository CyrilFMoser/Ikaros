package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char) extends T_A[D, T_B[D]]
case class CC_B[F, E](a: F, b: T_A[E, T_B[E]]) extends T_A[E, F]
case class CC_C() extends T_B[T_B[((Boolean,Int),Char)]]
case class CC_D(a: (T_B[CC_C],T_A[Byte, CC_C]), b: CC_C, c: T_B[T_A[CC_C, CC_C]]) extends T_B[T_B[((Boolean,Int),Char)]]
case class CC_E() extends T_B[T_B[((Boolean,Int),Char)]]

val v_a: T_A[Boolean, T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}