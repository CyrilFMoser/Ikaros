package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Byte, Boolean], C]
case class CC_B(a: Boolean, b: T_A[Boolean, T_A[Char, Byte]], c: Byte) extends T_A[T_A[Byte, Boolean], T_A[T_A[Byte, Boolean], Byte]]
case class CC_C() extends T_A[T_A[Byte, Boolean], T_A[T_A[Byte, Boolean], Byte]]

val v_a: T_A[T_A[Byte, Boolean], T_A[T_A[Byte, Boolean], Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}