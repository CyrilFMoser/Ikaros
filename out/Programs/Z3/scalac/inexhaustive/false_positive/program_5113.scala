package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: (Byte,Byte)) extends T_A[(Byte,Int)]

val v_a: T_A[(Byte,Int)] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,0)) => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_B Wildcard T_A) Wildcard T_A)