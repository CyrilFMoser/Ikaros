package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Boolean]
case class CC_B(a: CC_A) extends T_A[Boolean]
case class CC_C(a: CC_A, b: T_A[T_A[CC_A]]) extends T_A[Boolean]
case class CC_D(a: Int, b: Char, c: CC_A) extends T_B

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(CC_A())