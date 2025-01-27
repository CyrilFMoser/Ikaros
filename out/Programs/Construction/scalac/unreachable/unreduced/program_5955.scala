package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, T_B]) extends T_A[(Boolean,(Boolean,T_B)), T_A[Char, Int]]
case class CC_B() extends T_B
case class CC_C(a: CC_B, b: CC_A, c: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), CC_A(_), _) => 1 
}
}