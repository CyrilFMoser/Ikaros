package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[(T_A[Char, Int],T_A[Boolean, Boolean]), D]
case class CC_B[E](a: CC_A[E], b: CC_A[E]) extends T_A[(T_A[Char, Int],T_A[Boolean, Boolean]), E]
case class CC_C(a: T_A[T_B[Int], T_B[Boolean]], b: T_B[Boolean], c: Int) extends T_B[Boolean]
case class CC_D() extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, CC_C(_, _, _), _), _) => 0 
  case CC_C(_, CC_C(_, CC_D(), _), _) => 1 
  case CC_C(_, CC_D(), _) => 2 
  case CC_D() => 3 
}
}