package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[T_A[C]], b: T_B[C], c: T_A[C]) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C(a: CC_B[CC_B[Char]], b: T_A[T_B[Byte]]) extends T_B[T_A[T_A[Char]]]
case class CC_D(a: (T_A[CC_C],T_A[Char]), b: T_A[T_A[(Boolean,Boolean)]], c: Int) extends T_B[T_A[T_A[Char]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B()) => 1 
  case CC_B() => 2 
}
}