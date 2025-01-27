package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]], b: T_A[T_A[Int, Int], Int], c: T_A[CC_A[Byte], CC_A[(Byte,Char)]]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Boolean]], CC_A[T_A[Int, Char]]]
case class CC_C[D](a: D, b: D, c: CC_B) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(0, _, CC_B(_, _, _)) => 1 
  case CC_C(_, _, CC_B(_, _, _)) => 2 
}
}