package Program_15 

object Test {
sealed trait T_B[C, D]
case class CC_D(a: (Boolean,Byte)) extends T_B[Int, (Char,(Boolean,Boolean))]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D((_,0)) => 0 
}
}
// This is not matched: (CC_A T_A)