package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, T_B], b: T_B) extends T_A[(T_A[T_B, T_B],T_B), Boolean]
case class CC_B() extends T_A[(T_A[T_B, T_B],T_B), Boolean]
case class CC_C(a: Boolean, b: CC_A, c: (Char,((Boolean,Int),T_B))) extends T_B

val v_a: T_A[(T_A[T_B, T_B],T_B), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(true, _, _)) => 0 
  case CC_A(_, CC_C(false, _, _)) => 1 
  case CC_B() => 2 
}
}