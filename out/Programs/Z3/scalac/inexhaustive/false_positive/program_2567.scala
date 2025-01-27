package Program_31 

object Test {
sealed trait T_B[C, D]
case class CC_C[H](a: T_B[H, H], b: ((Boolean,Byte),Char)) extends T_B[T_B[Char, H], H]

val v_a: T_B[T_B[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_C(_, (_,'x')) => 0 
}
}
// This is not matched: (CC_B T_A T_A)