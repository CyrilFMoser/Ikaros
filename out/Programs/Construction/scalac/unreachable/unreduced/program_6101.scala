package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Char]], C]
case class CC_B() extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Char]], T_A[CC_A[Boolean], T_A[(Boolean,Int), Char]]]
case class CC_C[D](a: (Boolean,Boolean), b: CC_B, c: CC_B) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Char]], D]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _, _) => 1 
}
}