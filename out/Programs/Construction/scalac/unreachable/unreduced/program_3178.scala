package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[(Byte,Byte)]]) extends T_A[T_B[T_B[Boolean]]]
case class CC_B[C](a: T_A[C], b: CC_A, c: C) extends T_A[C]
case class CC_C() extends T_B[CC_B[Int]]
case class CC_D[D]() extends T_B[CC_B[Int]]

val v_a: T_A[T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, CC_A(_), _)) => 0 
  case CC_B(CC_A(_), _, _) => 1 
  case CC_B(CC_B(CC_A(_), CC_A(_), _), _, _) => 2 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_), _), _, _) => 3 
}
}