package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[Boolean, T_A[Boolean, Boolean]], c: Char) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C(a: CC_B[T_A[Char, Int]], b: T_A[CC_A[Boolean], CC_A[Boolean]], c: Boolean) extends T_A[CC_A[CC_A[Char]], T_A[Int, T_A[Int, Int]]]

val v_a: T_A[CC_C, T_A[CC_C, CC_C]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}