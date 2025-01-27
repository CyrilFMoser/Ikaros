package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Int, b: D) extends T_A[D, E]
case class CC_B(a: T_B[Boolean], b: Char) extends T_A[T_A[T_A[Int, Byte], CC_A[Int, Int]], CC_A[CC_A[(Boolean,Boolean), Int], T_B[Boolean]]]
case class CC_C() extends T_B[T_B[T_B[CC_B]]]

val v_a: T_A[T_A[T_A[Int, Byte], CC_A[Int, Int]], CC_A[CC_A[(Boolean,Boolean), Int], T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_B(_, _) => 1 
}
}