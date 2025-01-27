package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_A[T_B]], c: T_B) extends T_A[T_A[T_B]]
case class CC_B() extends T_A[T_A[T_B]]
case class CC_C(a: Char, b: (Char,T_A[Byte]), c: Boolean) extends T_B
case class CC_D(a: T_B, b: T_A[CC_B], c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, _, _) => 1 
}
}