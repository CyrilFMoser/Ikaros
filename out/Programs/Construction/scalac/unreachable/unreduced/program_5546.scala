package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Char], Byte]) extends T_A[T_A[T_A[Char, Int], T_A[Int, Byte]], (T_A[Byte, Int],T_A[Boolean, Char])]
case class CC_B[C](a: C, b: C) extends T_A[CC_A, C]
case class CC_C() extends T_A[T_A[T_A[Char, Int], T_A[Int, Byte]], (T_A[Byte, Int],T_A[Boolean, Char])]

val v_a: T_A[T_A[T_A[Char, Int], T_A[Int, Byte]], (T_A[Byte, Int],T_A[Boolean, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}