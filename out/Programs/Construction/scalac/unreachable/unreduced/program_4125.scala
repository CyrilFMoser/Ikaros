package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: C) extends T_A[C, T_A[C, T_A[Int, C]]]
case class CC_B() extends T_A[T_A[CC_A[Boolean], CC_A[Boolean]], T_A[T_A[CC_A[Boolean], CC_A[Boolean]], T_A[Int, T_A[CC_A[Boolean], CC_A[Boolean]]]]]

val v_a: T_A[T_A[CC_A[Boolean], CC_A[Boolean]], T_A[T_A[CC_A[Boolean], CC_A[Boolean]], T_A[Int, T_A[CC_A[Boolean], CC_A[Boolean]]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}