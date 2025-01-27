package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Int, Int], T_A[(Boolean,Char), Char]], C]
case class CC_B[D](a: CC_A[T_A[Byte, D]], b: D, c: T_A[D, D]) extends T_A[T_A[T_A[Int, Int], T_A[(Boolean,Char), Char]], D]
case class CC_C(a: Boolean, b: CC_A[T_A[Int, Byte]], c: CC_B[CC_B[Byte]]) extends T_A[T_A[T_A[Int, Int], T_A[(Boolean,Char), Char]], CC_B[T_A[Char, Byte]]]

val v_a: T_A[T_A[T_A[Int, Int], T_A[(Boolean,Char), Char]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
}
}