package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (T_A[(Boolean,Int)],T_A[Int]), b: T_B[C]) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C(a: CC_B[T_A[Int]], b: T_A[T_A[(Byte,Char)]], c: T_A[T_A[Byte]]) extends T_B[Byte]

val v_a: T_A[T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}