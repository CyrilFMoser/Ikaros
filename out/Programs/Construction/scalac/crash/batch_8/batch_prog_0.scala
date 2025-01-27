package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[Int, T_A[Int, Boolean]]]
case class CC_B(a: T_A[T_A[Byte, Boolean], T_A[(Boolean,Byte), Char]]) extends T_A[CC_A[CC_A[Byte]], T_A[Int, T_A[Int, Boolean]]]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}