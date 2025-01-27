package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Int,(Char,Char))], b: Byte) extends T_A[Char]
case class CC_B(a: CC_A, b: Int) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}