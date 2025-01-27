package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: C, c: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: CC_A[D], b: Boolean) extends T_A[T_A[CC_A[Int], CC_A[Boolean]], T_A[T_A[CC_A[Int], CC_A[Boolean]], T_A[CC_A[Int], CC_A[Boolean]]]]
case class CC_C(a: CC_B[CC_B[Byte]]) extends T_A[CC_A[Boolean], T_A[CC_A[Boolean], CC_A[Boolean]]]

val v_a: T_A[T_A[CC_A[Int], CC_A[Boolean]], T_A[T_A[CC_A[Int], CC_A[Boolean]], T_A[CC_A[Int], CC_A[Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A('x', _, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_, _) => 2 
}
}