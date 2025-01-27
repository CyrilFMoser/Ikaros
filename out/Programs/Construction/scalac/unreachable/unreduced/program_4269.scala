package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Char]], b: (T_A[Byte],T_A[Boolean])) extends T_A[T_A[T_B[Boolean]]]
case class CC_B[C](a: T_B[C], b: CC_A, c: Boolean) extends T_B[C]
case class CC_C[D]() extends T_B[D]
case class CC_D(a: T_B[(CC_A,CC_A)], b: T_A[T_B[CC_A]], c: T_A[Byte]) extends T_B[CC_B[Byte]]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), _, _), CC_A(_, _), _) => 0 
  case CC_B(CC_B(CC_C(), _, _), CC_A(_, _), _) => 1 
  case CC_B(CC_C(), CC_A(_, _), _) => 2 
  case CC_C() => 3 
}
}