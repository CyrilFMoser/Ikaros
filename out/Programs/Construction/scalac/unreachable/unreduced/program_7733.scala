package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[Int]]
case class CC_B(a: T_A[T_A[Int]], b: T_A[T_A[Int]], c: T_A[(Boolean,Char)]) extends T_A[T_A[Int]]
case class CC_C(a: CC_B, b: CC_A) extends T_A[T_A[Int]]
case class CC_D[D, E]() extends T_B[D, E]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_B(CC_A(), _, _), _) => 1 
  case CC_B(_, CC_B(CC_B(_, _, _), _, _), _) => 2 
  case CC_B(_, CC_B(CC_C(_, _), _, _), _) => 3 
  case CC_B(_, CC_C(_, _), _) => 4 
  case CC_C(CC_B(_, _, _), CC_A()) => 5 
}
}
// This is not matched: CC_B(_, CC_A(), _)