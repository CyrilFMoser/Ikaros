package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Int], Int], b: Byte) extends T_A[T_A[T_A[Byte, Boolean], T_A[Int, Char]], T_A[T_A[Byte, Boolean], Byte]]
case class CC_B(a: CC_A, b: T_A[T_A[CC_A, CC_A], T_A[(Boolean,Int), CC_A]], c: CC_A) extends T_A[T_A[T_A[Byte, Boolean], T_A[Int, Char]], T_A[T_A[Byte, Boolean], Byte]]
case class CC_C(a: Byte) extends T_A[T_A[T_A[Byte, Boolean], T_A[Int, Char]], T_A[T_A[Byte, Boolean], Byte]]

val v_a: T_A[T_A[T_A[Byte, Boolean], T_A[Int, Char]], T_A[T_A[Byte, Boolean], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}