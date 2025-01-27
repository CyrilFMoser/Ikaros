package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Int, T_A[Char, Byte]], C]
case class CC_B[D](a: Char, b: T_A[D, D], c: Char) extends T_A[T_A[Int, T_A[Char, Byte]], D]
case class CC_C(a: Boolean, b: CC_B[CC_A[Boolean]]) extends T_A[T_A[Int, T_A[Char, Byte]], CC_A[CC_B[(Boolean,Byte)]]]

val v_a: T_A[T_A[Int, T_A[Char, Byte]], CC_A[CC_B[(Boolean,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B('x', _, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(true, CC_B(_, _, _)) => 3 
  case CC_C(false, CC_B(_, _, _)) => 4 
}
}