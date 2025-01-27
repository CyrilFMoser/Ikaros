package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Byte], b: (T_A[Int],Char)) extends T_A[Int]
case class CC_B(a: T_A[CC_A], b: CC_A) extends T_A[Int]
case class CC_C[C, D]() extends T_B[C]
case class CC_D[E]() extends T_B[E]
case class CC_E() extends T_B[CC_D[T_A[Int]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _) => 0 
  case CC_A(CC_D(), _) => 1 
  case CC_B(_, CC_A(CC_C(), _)) => 2 
  case CC_B(_, CC_A(CC_D(), _)) => 3 
}
}