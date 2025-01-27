package Program_14 

object Test {
sealed trait T_A[A]
case class CC_C[E](a: ((Byte,Byte),Byte)) extends T_A[E]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C((_,0)) => 0 
}
}
// This is not matched: (CC_D T_B)