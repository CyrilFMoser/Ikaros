package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[T_A[Int, Byte], T_A[Char, Byte]], C]
case class CC_B(a: T_A[T_A[Char, Byte], (Boolean,Boolean)], b: CC_A[T_A[(Byte,Char), Int], CC_A[Int, Boolean]]) extends T_A[T_A[T_A[Int, Byte], T_A[Char, Byte]], Boolean]

val v_a: T_A[T_A[T_A[Int, Byte], T_A[Char, Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
}
}