package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_A[C]) extends T_A[C]
case class CC_B[D](a: D) extends T_A[D]
case class CC_C[E]() extends T_A[E]
case class CC_D(a: (T_A[Int],CC_A[(Byte,Char)]), b: (CC_C[Byte],T_A[Char]), c: T_B[T_A[Int]]) extends T_B[T_A[CC_C[Boolean]]]
case class CC_E(a: T_A[T_A[CC_D]], b: Int) extends T_B[T_A[CC_C[Boolean]]]
case class CC_F(a: T_A[T_A[CC_D]], b: Int) extends T_B[T_A[CC_C[Boolean]]]

val v_a: T_B[T_A[CC_C[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(CC_A(_, _), _) => 1 
  case CC_E(CC_B(_), _) => 2 
  case CC_E(CC_C(), _) => 3 
}
}
// This is not matched: CC_F(_, _)