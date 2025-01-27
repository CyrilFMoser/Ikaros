package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_B[Boolean]
case class CC_C(a: Char, b: T_B[T_B[Boolean]], c: T_A[T_B[Boolean]]) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}