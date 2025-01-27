package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[D, D], b: T_A[T_A[CC_A[D], CC_A[D]], CC_A[D]], c: D) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
  case CC_B(_, CC_B(_, CC_A(), _), _) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 3 
}
}