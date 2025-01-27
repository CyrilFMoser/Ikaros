package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Boolean], T_A[Char, Char]], b: T_A[T_A[Char, Char], (Boolean,Boolean)], c: (T_A[Byte, Boolean],T_A[Boolean, Boolean])) extends T_A[T_A[T_A[Int, Int], Char], T_A[T_A[(Int,Int), Boolean], T_A[Boolean, Byte]]]
case class CC_B[C](a: CC_A, b: T_A[C, C], c: T_A[T_A[C, C], C]) extends T_A[T_A[Byte, (Byte,CC_A)], C]
case class CC_C[D]() extends T_A[T_A[Byte, (Byte,CC_A)], D]

val v_a: T_A[T_A[Byte, (Byte,CC_A)], Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _, _) => 0 
  case CC_C() => 1 
}
}