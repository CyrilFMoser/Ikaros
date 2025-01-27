package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: T_A[T_B[Int]], b: Int) extends T_A[T_A[T_A[Boolean]]]
case class CC_C[D](a: T_B[D], b: Boolean) extends T_A[D]
case class CC_D() extends T_B[CC_A[CC_C[CC_B]]]
case class CC_E() extends T_B[CC_A[CC_C[CC_B]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_B(CC_C(_, _), _) => 2 
  case CC_C(_, _) => 3 
}
}