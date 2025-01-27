package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Byte, T_A[Char, Byte]], b: T_A[T_A[Byte, Boolean], Boolean]) extends T_A[((Boolean,Boolean),T_A[Boolean, Char]), T_A[T_A[Char, Int], Boolean]]
case class CC_B() extends T_A[((Boolean,Boolean),T_A[Boolean, Char]), T_A[T_A[Char, Int], Boolean]]

val v_a: T_A[((Boolean,Boolean),T_A[Boolean, Char]), T_A[T_A[Char, Int], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}