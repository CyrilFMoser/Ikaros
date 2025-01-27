package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D], c: CC_A[D]) extends T_A[CC_A[CC_A[Byte]], D]
case class CC_C[E](a: (CC_B[Boolean],T_A[Boolean, Int]), b: Char) extends T_A[E, T_A[E, E]]

val v_a: T_A[CC_A[CC_A[Byte]], T_A[CC_A[CC_A[Byte]], CC_A[CC_A[Byte]]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}