package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_A[Boolean]], c: T_A[T_A[Boolean]]) extends T_A[(T_A[Byte],(Char,(Char,Char)))]
case class CC_B(a: CC_A) extends T_A[(T_A[Byte],(Char,(Char,Char)))]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}