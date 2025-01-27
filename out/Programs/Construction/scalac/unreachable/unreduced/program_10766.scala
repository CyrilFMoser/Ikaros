package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Int, T_A[T_A[Char, Boolean], Boolean]]
case class CC_B(a: CC_A) extends T_A[Int, T_A[T_A[Char, Boolean], Boolean]]
case class CC_C(a: T_A[CC_B, Byte], b: CC_A) extends T_A[Int, T_A[T_A[Char, Boolean], Boolean]]

val v_a: T_A[Int, T_A[T_A[Char, Boolean], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_C(_, _) => 2 
}
}