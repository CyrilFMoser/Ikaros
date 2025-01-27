package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[Char, Byte], C]
case class CC_B[D](a: T_A[D, D], b: CC_A[CC_A[D]], c: Boolean) extends T_A[T_A[CC_A[Int], Int], D]
case class CC_C(a: CC_B[Int], b: Char, c: CC_B[T_A[Int, (Byte,Char)]]) extends T_A[T_A[Char, Byte], T_A[(Boolean,(Char,Boolean)), T_A[Char, Boolean]]]

val v_a: T_A[T_A[Char, Byte], T_A[(Boolean,(Char,Boolean)), T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _, _) => 1 
}
}