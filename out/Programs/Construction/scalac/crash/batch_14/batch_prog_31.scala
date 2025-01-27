package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Char,(Byte,Char))], b: Int) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
  case CC_A(_, _) => 1 
}
}