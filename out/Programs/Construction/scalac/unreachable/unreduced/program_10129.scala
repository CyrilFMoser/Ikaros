package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_A[T_B]]) extends T_A[T_A[Byte]]
case class CC_B() extends T_A[T_A[Byte]]
case class CC_C(a: T_A[T_A[T_B]]) extends T_B

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_), _) => 0 
  case CC_B() => 1 
}
}