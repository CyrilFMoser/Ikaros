package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Int], T_A[Boolean, Int]], b: T_A[Char, Boolean]) extends T_A[T_A[T_A[Char, Boolean], T_A[Int, Byte]], (T_A[Int, Boolean],T_A[(Byte,Int), Boolean])]
case class CC_B() extends T_A[T_A[T_A[Char, Boolean], T_A[Int, Byte]], (T_A[Int, Boolean],T_A[(Byte,Int), Boolean])]
case class CC_C[C](a: T_A[C, C]) extends T_A[C, CC_B]

val v_a: T_A[T_A[T_A[Char, Boolean], T_A[Int, Byte]], (T_A[Int, Boolean],T_A[(Byte,Int), Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}