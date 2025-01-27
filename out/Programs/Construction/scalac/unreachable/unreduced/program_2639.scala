package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_B[T_B[(Boolean,Char)]]) extends T_A
case class CC_B(a: T_B[T_B[Byte]], b: T_B[T_B[CC_A]], c: Boolean) extends T_B[T_B[Byte]]
case class CC_C() extends T_B[T_B[Byte]]
case class CC_D(a: Char) extends T_B[T_B[Byte]]

val v_a: T_B[T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), _, _) => 0 
  case CC_B(CC_C(), _, _) => 1 
  case CC_B(CC_D(_), _, _) => 2 
  case CC_C() => 3 
  case CC_D(_) => 4 
}
}