package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Boolean]
case class CC_B[C](a: C, b: T_B[T_B[C]], c: CC_A) extends T_B[C]
case class CC_C[D](a: T_A[D], b: T_B[D], c: T_B[D]) extends T_B[D]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _, CC_A()), CC_A()) => 0 
  case CC_B(_, CC_C(_, CC_B(_, _, _), CC_B(_, _, _)), CC_A()) => 1 
  case CC_B(_, CC_C(_, CC_B(_, _, _), CC_C(_, _, _)), CC_A()) => 2 
  case CC_B(_, CC_C(_, CC_C(_, _, _), CC_B(_, _, _)), CC_A()) => 3 
  case CC_B(_, CC_C(_, CC_C(_, _, _), CC_C(_, _, _)), CC_A()) => 4 
  case CC_C(_, CC_B(_, _, _), _) => 5 
  case CC_C(_, CC_C(_, _, CC_B(_, _, _)), _) => 6 
  case CC_C(_, CC_C(_, _, CC_C(_, _, _)), _) => 7 
}
}