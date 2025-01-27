package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: Char, b: T_A[(CC_A,(Char,Byte))], c: Boolean) extends T_A[T_B]
case class CC_C[B](a: T_B, b: Int, c: B) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}