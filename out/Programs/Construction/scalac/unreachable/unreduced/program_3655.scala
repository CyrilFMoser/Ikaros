package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Int], b: T_A[Int]) extends T_A[T_B[T_B[Char]]]
case class CC_B() extends T_B[((Byte,CC_A),T_A[Int])]
case class CC_C[C](a: Boolean, b: CC_A, c: T_B[C]) extends T_B[C]

val v_a: T_B[((Byte,CC_A),T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_A(_, _), CC_B()) => 1 
  case CC_C(_, CC_A(_, _), CC_C(_, _, CC_B())) => 2 
  case CC_C(_, CC_A(_, _), CC_C(_, _, CC_C(_, _, _))) => 3 
}
}