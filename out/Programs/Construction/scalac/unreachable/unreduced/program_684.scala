package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[Int, C]) extends T_A[C, T_A[T_A[(Boolean,Boolean), Byte], T_A[Byte, Int]]]
case class CC_B() extends T_A[T_A[CC_A[Char], CC_A[Byte]], T_A[T_A[(Boolean,Boolean), Byte], T_A[Byte, Int]]]
case class CC_C(a: CC_B) extends T_A[T_A[CC_A[Char], CC_A[Byte]], T_A[T_A[(Boolean,Boolean), Byte], T_A[Byte, Int]]]

val v_a: T_A[T_A[CC_A[Char], CC_A[Byte]], T_A[T_A[(Boolean,Boolean), Byte], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_B()) => 2 
}
}