package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_A[D], b: T_A[D], c: T_B[D]) extends T_A[D]
case class CC_C() extends T_B[CC_B[T_A[Int]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
  case CC_B(_, CC_B(CC_A(), _, _), _) => 2 
  case CC_B(_, CC_B(CC_B(_, _, _), _, _), _) => 3 
}
}