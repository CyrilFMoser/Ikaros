package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Byte]]
case class CC_B(a: (CC_A,Char)) extends T_A[(Boolean,Boolean)]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((_,'x')) => 0 
}
}
// This is not matched: (CC_A Int (CC_B Char Wildcard (T_A Char)) (T_A Int))