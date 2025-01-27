package Program_59 

object Test {
sealed trait T_A[A]
case class CC_A[D](a: (Byte,Char)) extends T_A[D]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((_,'x')) => 0 
}
}
// This is not matched: (CC_C T_A T_A)