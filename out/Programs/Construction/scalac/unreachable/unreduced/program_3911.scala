package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: Byte, c: T_B[D, D]) extends T_A[D]
case class CC_B(a: T_A[T_B[Char, Boolean]]) extends T_A[T_A[CC_A[Boolean]]]
case class CC_C() extends T_B[T_A[T_A[Byte]], T_A[Boolean]]
case class CC_D(a: CC_C, b: CC_A[T_A[CC_C]], c: Char) extends T_B[T_A[T_A[Byte]], T_A[Boolean]]
case class CC_E(a: CC_B) extends T_B[T_A[T_A[Byte]], T_A[Boolean]]

val v_a: T_B[T_A[T_A[Byte]], T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C(), CC_A(_, _, _), _) => 1 
}
}
// This is not matched: CC_E(_)