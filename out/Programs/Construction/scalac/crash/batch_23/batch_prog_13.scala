package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: T_A[C], b: T_A[C]) extends T_A[C]
case class CC_C(a: T_A[T_A[(Byte,Boolean)]], b: CC_B[Char]) extends T_A[T_A[CC_B[Int]]]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), CC_A()) => 0 
  case CC_B(CC_B(_, CC_A()), CC_A()) => 1 
  case CC_B(CC_B(_, CC_B(_, _)), CC_A()) => 2 
  case CC_B(CC_A(), CC_B(_, _)) => 3 
  case CC_B(CC_B(_, CC_A()), CC_B(_, _)) => 4 
  case CC_B(CC_B(_, CC_B(_, _)), CC_B(_, _)) => 5 
}
}