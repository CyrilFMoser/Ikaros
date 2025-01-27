package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: Boolean, b: D, c: T_B[D]) extends T_A[D]
case class CC_C(a: T_A[CC_A[Char]]) extends T_A[CC_B[T_A[Char]]]
case class CC_D() extends T_B[CC_A[(CC_C,CC_C)]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}