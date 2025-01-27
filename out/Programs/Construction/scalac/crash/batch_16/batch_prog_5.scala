package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[(Char,Char)]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Char]]]
case class CC_C() extends T_A[(CC_B,T_A[CC_A])]

val v_a: T_A[(CC_B,T_A[CC_A])] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}